<%@ page contentType="text/html; charset=GBK"%>

<head>
<!--  ��Ҫ�����Ҫ��js�ļ���������Ҫjquery����js�ļ����Լ�easyui����Ҫ���ļ�    -->
<title>��������(�������ڡ������С���;֮�ҡ���ҵ����)������Ϣ�б�</title>

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
				url: 'listResettleBase',
				striped: true,
				singleSelect: true,
				title:'��������(�������ڡ������С���;֮�ҡ���ҵ����)������Ϣ',
				pagination:true,
				sortOrder: 'asc',
				idField:'id',
				loadMsg:'���ڲ�ѯ�����Ե�...',
				fit: true,
		//		onLoadSuccess:handlerExp(),
				fitColumns: true,
				columns:[[
					{field:'typeText',title:'������������',width:200,align:'center'},
					{field:'mingcheng',title:'����',width:200,align:'center'},
					{field:'dizhi',title:'��ַ',width:200,align:'center'},
					{field:'dengjima',title:'�Ǽ���',width:200,align:'center'},
					{field:'leibie',title:'���',width:200,align:'center'},
					{field:'lianxifangshi',title:'��ϵ��ʽ',width:200,align:'center'},
					{field:'removed',title:'ɾ����ʶ',width:200,align:'center'},
					{field:'createUserId',title:'������',width:200,align:'center'},
					{field:'createUserName',title:'����������',width:200,align:'center'},
					{field:'quxianId',title:'��������',width:200,align:'center'},
					{field:'quxianName',title:'������������',width:200,align:'center'},
					{field:'remark',title:'��ע',width:200,align:'center'},
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
			$("#tt").datagrid("options").url='listResettleBase';
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
			window.open("editResettleBase?id="+id); 
		}
		
		function del(id){
			if(confirm("�Ƿ�ȷ��ɾ����")){
				$.post("deleteResettleBase","id="+id,
	   			   function (data, textStatus){
	   			      alert("ɾ���ɹ���");
	   			      refresh();
	   			   });
			}
		}
		
		
		</script>

</body>

