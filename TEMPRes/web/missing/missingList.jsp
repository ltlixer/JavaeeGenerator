<%@ page contentType="text/html; charset=GBK"%>

<head>
<!--  ��Ҫ�����Ҫ��js�ļ���������Ҫjquery����js�ļ����Լ�easyui����Ҫ���ļ�    -->
<title>���䲻�������б�</title>

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
				url: 'listMissing',
				striped: true,
				singleSelect: true,
				title:'���䲻������',
				pagination:true,
				sortOrder: 'asc',
				idField:'id',
				loadMsg:'���ڲ�ѯ�����Ե�...',
				fit: true,
		//		onLoadSuccess:handlerExp(),
				fitColumns: true,
				columns:[[
					{field:'isRemoved',title:'ID',width:200,align:'center'},
					{field:'lts',title:'¼��ʱ��',width:200,align:'center'},
					{field:'pid',title:'�����ʶ',width:200,align:'center'},
					{field:'xingming',title:'����',width:200,align:'center'},
					{field:'quxianCode',title:'����',width:200,align:'center'},
					{field:'quxianText',title:'QUXIAN_TEXT',width:200,align:'center'},
					{field:'jiezhenCode',title:'����',width:200,align:'center'},
					{field:'jiezhenText',title:'JIEZHEN_TEXT',width:200,align:'center'},
					{field:'jibieCode',title:'��ֹ����',width:200,align:'center'},
					{field:'jibieText',title:'JIBIE_TEXT',width:200,align:'center'},
					{field:'nianyue',title:'����',width:200,align:'center'},
					{field:'yuanyin',title:'���䲻��ԭ��',width:200,align:'center'},
					{field:'qishi',title:'���䲻����ʱ',width:200,align:'center'},
					{field:'nengfoulianxiCode',title:'�ܷ���ϵ',width:200,align:'center'},
					{field:'nengfoulianxiText',title:'NENGFOULIANXI_TEXT',width:200,align:'center'},
					{field:'cengjuzhudi',title:'����ס��',width:200,align:'center'},
					{field:'xinxilaiyuanCode',title:'��Ϣ��Դ',width:200,align:'center'},
					{field:'xinxilaiyuanText',title:'XINXILAIYUAN_TEXT',width:200,align:'center'},
					{field:'xinxilaiyuanQita',title:'��Ϣ��Դ����',width:200,align:'center'},
					{field:'chazhaofangshiCode',title:'�Ѳ�ȡ���ҷ�ʽ',width:200,align:'center'},
					{field:'chazhaofangshiText',title:'CHAZHAOFANGSHI_TEXT',width:200,align:'center'},
					{field:'chazhaofangshiQita',title:'�Ѳ�ȡ���ҷ�ʽ����',width:200,align:'center'},
					{field:'tonghuashijian',title:'ͨ��ʱ��',width:200,align:'center'},
					{field:'jiedianren',title:'�ӵ���',width:200,align:'center'},
					{field:'tonghuaneirong',title:'ͨ������',width:200,align:'center'},
					{field:'tonghuajiluren',title:'ͨ����¼��',width:200,align:'center'},
					{field:'chafangshijian',title:'���ʱ��',width:200,align:'center'},
					{field:'xiajieduanchazhaofangan',title:'�½׶β��ҷ���',width:200,align:'center'},
					{field:'beizhu',title:'��ע',width:200,align:'center'},
					{field:'chafangdidian',title:'��õص�',width:200,align:'center'},
					{field:'chafangjieguo',title:'��ý��',width:200,align:'center'},
					{field:'chafangjiluren',title:'��ü�¼��',width:200,align:'center'},
					{field:'removed',title:'ɾ����ʶ',width:200,align:'center'},
					{field:'createUserId',title:'������',width:200,align:'center'},
					{field:'createUserName',title:'����������',width:200,align:'center'},
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
			$("#tt").datagrid("options").url='listMissing';
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
			window.open("editMissing?id="+id); 
		}
		
		function del(id){
			if(confirm("�Ƿ�ȷ��ɾ����")){
				$.post("deleteMissing","id="+id,
	   			   function (data, textStatus){
	   			      alert("ɾ���ɹ���");
	   			      refresh();
	   			   });
			}
		}
		
		
		</script>

</body>

