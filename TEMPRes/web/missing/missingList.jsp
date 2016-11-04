<%@ page contentType="text/html; charset=GBK"%>

<head>
<!--  需要引入必要的js文件，这里需要jquery基本js文件，以及easyui所需要的文件    -->
<title>下落不明查找列表</title>

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
				url: 'listMissing',
				striped: true,
				singleSelect: true,
				title:'下落不明查找',
				pagination:true,
				sortOrder: 'asc',
				idField:'id',
				loadMsg:'正在查询，请稍等...',
				fit: true,
		//		onLoadSuccess:handlerExp(),
				fitColumns: true,
				columns:[[
					{field:'isRemoved',title:'ID',width:200,align:'center'},
					{field:'lts',title:'录入时间',width:200,align:'center'},
					{field:'pid',title:'对象标识',width:200,align:'center'},
					{field:'xingming',title:'姓名',width:200,align:'center'},
					{field:'quxianCode',title:'区县',width:200,align:'center'},
					{field:'quxianText',title:'QUXIAN_TEXT',width:200,align:'center'},
					{field:'jiezhenCode',title:'街镇',width:200,align:'center'},
					{field:'jiezhenText',title:'JIEZHEN_TEXT',width:200,align:'center'},
					{field:'jibieCode',title:'终止类型',width:200,align:'center'},
					{field:'jibieText',title:'JIBIE_TEXT',width:200,align:'center'},
					{field:'nianyue',title:'年月',width:200,align:'center'},
					{field:'yuanyin',title:'下落不明原因',width:200,align:'center'},
					{field:'qishi',title:'下落不明起时',width:200,align:'center'},
					{field:'nengfoulianxiCode',title:'能否联系',width:200,align:'center'},
					{field:'nengfoulianxiText',title:'NENGFOULIANXI_TEXT',width:200,align:'center'},
					{field:'cengjuzhudi',title:'曾居住地',width:200,align:'center'},
					{field:'xinxilaiyuanCode',title:'信息来源',width:200,align:'center'},
					{field:'xinxilaiyuanText',title:'XINXILAIYUAN_TEXT',width:200,align:'center'},
					{field:'xinxilaiyuanQita',title:'信息来源其他',width:200,align:'center'},
					{field:'chazhaofangshiCode',title:'已采取查找方式',width:200,align:'center'},
					{field:'chazhaofangshiText',title:'CHAZHAOFANGSHI_TEXT',width:200,align:'center'},
					{field:'chazhaofangshiQita',title:'已采取查找方式其他',width:200,align:'center'},
					{field:'tonghuashijian',title:'通话时间',width:200,align:'center'},
					{field:'jiedianren',title:'接电人',width:200,align:'center'},
					{field:'tonghuaneirong',title:'通话内容',width:200,align:'center'},
					{field:'tonghuajiluren',title:'通话记录人',width:200,align:'center'},
					{field:'chafangshijian',title:'查访时间',width:200,align:'center'},
					{field:'xiajieduanchazhaofangan',title:'下阶段查找方案',width:200,align:'center'},
					{field:'beizhu',title:'备注',width:200,align:'center'},
					{field:'chafangdidian',title:'查访地点',width:200,align:'center'},
					{field:'chafangjieguo',title:'查访结果',width:200,align:'center'},
					{field:'chafangjiluren',title:'查访记录人',width:200,align:'center'},
					{field:'removed',title:'删除标识',width:200,align:'center'},
					{field:'createUserId',title:'创建人',width:200,align:'center'},
					{field:'createUserName',title:'创建人姓名',width:200,align:'center'},
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
			$("#tt").datagrid("options").url='listMissing';
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
			window.open("editMissing?id="+id); 
		}
		
		function del(id){
			if(confirm("是否确定删除？")){
				$.post("deleteMissing","id="+id,
	   			   function (data, textStatus){
	   			      alert("删除成功！");
	   			      refresh();
	   			   });
			}
		}
		
		
		</script>

</body>

