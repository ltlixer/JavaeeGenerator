<%@ page contentType="text/html; charset=GBK"%>

<head>
<!--  ��Ҫ�����Ҫ��js�ļ���������Ҫjquery����js�ļ����Լ�easyui����Ҫ���ļ�    -->
<title>���䲻������ ����ϵ�б�</title>

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
	     	<td><input name="button" type='button' class="button_style" onclick="javascript:subSearchBut()" value='��ѯ' /></td>		
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
				url: 'listMissingRelationship',
				striped: true,
				singleSelect: true,
				title:'���䲻������ ����ϵ',
				pagination:true,
				sortOrder: 'asc',
				idField:'id',
				loadMsg:'���ڲ�ѯ�����Ե�...',
				fit: true,
		//		onLoadSuccess:handlerExp(),
				fitColumns: true,
				columns:[[
					{field:'id',title:'ID',width:200,align:'center'},
					{field:'bid',title:'���䲻������ID',width:200,align:'center'},
					{field:'xingming',title:'����',width:200,align:'center'},
					{field:'guanxiCode',title:'��ϵ',width:200,align:'center'},
					{field:'guanxiText',title:'GUANXI_TEXT',width:200,align:'center'},
					{field:'lianxifangshi',title:'��ϵ��ʽ',width:200,align:'center'},
 					{field:'operate',title:'����',width:200,align:'center',formatter:function(value,rowData,rowIndex){
 	                        var c="";
 	                        c+="<a href=\"javascript:viewDetail('"+rowData.id+"');\" > �޸�</a> | <a href=\"javascript:del('"+rowData.id+"');\" > ɾ��</a>";
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
			$("#tt").datagrid("options").url='listMissingRelationship';
			$("#tt").datagrid("reload",obj);
		}
		
		function subSearchBut(){
			//��ʾ��һҳ���� 
			$("#tt").datagrid("options").pageNumber = 1;  
			//��ҳ������ת����һҳ  
			$("#tt").datagrid('getPager').pagination({pageNumber: 1});  
			subSearch();
		}
		
		function viewDetail(id){
			window.open("editMissingRelationship?id="+id); 
		}
		
		function del(id){
			if(confirm("�Ƿ�ȷ��ɾ����")){
				$.post("deleteMissingRelationship","id="+id,
	   			   function (data, textStatus){
	   			      alert("ɾ���ɹ���");
	   			      refresh();
	   			   });
			}
		}
		
		
		</script>

</body>

