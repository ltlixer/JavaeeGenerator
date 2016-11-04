<%@ page contentType="text/html; charset=${domain.pageEncoding}"%>

<head>
<!--  需要引入必要的js文件，这里需要jquery基本js文件，以及easyui所需要的文件    -->
<title>${domain.comments}列表</title>

</head>


<body>

	<table id="searchTable" width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="">
	    <tr>
	        <td width="12%">&nbsp;</td>
			<td width="31%">&nbsp;</td>
	        <td width="8%">&nbsp;</td>
	        <td width="39%">&nbsp;</td>
	        <td width="10%">&nbsp;</td>
	        
		</tr>
		
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
	     	<td><input name="button" type='button' class="button_style" onclick="javascript:subSearchBut()" value='查询' /></td>		
		</tr>
		
		<tr>
	        <td>&nbsp;</td> 
	        <td>&nbsp;</td>
	        <td>&nbsp;</td>
	        <td>&nbsp;</td>
	        <td>&nbsp;</td>
	     </tr>
	</table>
		    	
  <table id="tt" style="width:90%;height:500px"></table>
	
	<script>
		$(function(){
			$('#tt').datagrid({
				url: 'list${domain.entityName?cap_first}',
				striped: true,
				singleSelect: true,
				title:'${domain.comments}',
				pagination:true,
				sortOrder: 'asc',
				idField:'id',
				loadMsg:'正在查询，请稍等...',
				fit: true,
		//		onLoadSuccess:handlerExp(),
				fitColumns: true,
				columns:[[
					<#list fields as po>
					<#if po.showList == 'true'>
					{field:'<#if !po.dbName?? || po.dbName == ''>${domain.fkFieldName}.</#if>${po.name}',title:'${po.comments}',width:200,align:'center'<#if !po.dbName?? || po.dbName == ''>,
						formatter: function(value,row,index){
 		               		return row['${domain.fkFieldName}']['${po.name}'];
 		               	}
 		            </#if>},
					<#else>
                    </#if>
                    </#list>
 					{field:'operate',title:'操作',width:200,align:'center',formatter:function(value,rowData,rowIndex){
 	                        var c="";
 	                        c+="<a href=\"javascript:viewDetail('"+rowData.id+"');\" > 修改</a> | <a href=\"javascript:del('"+rowData.id+"');\" > 删除</a>";
 	                        return c;
 						}
                    }	
				]]
			});
		
		});
		
		function refresh(){
			 $('#tt').datagrid("reload");
		}
		
		function subSearch(){
			var obj=$("#search").serializeObject();
			$("#tt").datagrid("options").url='list${domain.entityName?cap_first}';
			$("#tt").datagrid("reload",obj);
		}
		
		function subSearchBut(){
			//显示第一页数据 
			$("#tt").datagrid("options").pageNumber = 1;  
			//分页栏上跳转到第一页  
			$("#tt").datagrid('getPager').pagination({pageNumber: 1});  
			subSearch();
		}
		
		function viewDetail(id){
			window.open("edit${domain.entityName?cap_first}?id="+id); 
		}
		
		function del(id){
			if(confirm("是否确定删除？")){
				$.post("delete${domain.entityName?cap_first}","id="+id,
	   			   function (data, textStatus){
	   			      alert("删除成功！");
	   			      refresh();
	   			   });
			}
		}
		
		
		</script>

</body>

