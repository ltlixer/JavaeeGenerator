<%@ page contentType="text/html; charset=GBK"%>

<head>
<!--  ��Ҫ�����Ҫ��js�ļ���������Ҫjquery����js�ļ����Լ�easyui����Ҫ���ļ�    -->
<title>���ð�̵���ԭʼ��Ϣ���б�</title>

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
				url: 'listImportPersonInfo',
				striped: true,
				singleSelect: true,
				title:'���ð�̵���ԭʼ��Ϣ��',
				pagination:true,
				sortOrder: 'asc',
				idField:'id',
				loadMsg:'���ڲ�ѯ�����Ե�...',
				fit: true,
		//		onLoadSuccess:handlerExp(),
				fitColumns: true,
				columns:[[
					{field:'id',title:'��ʶ',width:200,align:'center'},
					{field:'lts',title:'����ʱ��',width:200,align:'center'},
					{field:'pid',title:'����Ա������Ϣ����id',width:200,align:'center'},
					{field:'xingming',title:'����',width:200,align:'center'},
					{field:'daorulaiyuan',title:'������Դ',width:200,align:'center'},
					{field:'cengyongming',title:'������',width:200,align:'center'},
					{field:'xingbie',title:'�Ա�',width:200,align:'center'},
					{field:'shenfenzheng',title:'���֤��',width:200,align:'center'},
					{field:'chushengriqi',title:'��������',width:200,align:'center'},
					{field:'minzu',title:'����',width:200,align:'center'},
					{field:'wenhuachengdu',title:'�Ļ��̶�',width:200,align:'center'},
					{field:'nongcunji',title:'�Ƿ�ũ�弮',width:200,align:'center'},
					{field:'hujidizhi',title:'������ַ',width:200,align:'center'},
					{field:'tiqianshifang',title:'�Ƿ���ǰ�ͷ�',width:200,align:'center'},
					{field:'shifangshijian',title:'�ͷ�ʱ��',width:200,align:'center'},
					{field:'zuiming',title:'����',width:200,align:'center'},
					{field:'xingqi',title:'����',width:200,align:'center'},
					{field:'fujiaxing',title:'������',width:200,align:'center'},
					{field:'leifan',title:'�Ƿ��۷�',width:200,align:'center'},
					{field:'xidushi',title:'����ʷ',width:200,align:'center'},
					{field:'zhiyejinengpeixun',title:'�Ƿ�μ�ְҵ������ѵ',width:200,align:'center'},
					{field:'zhiyejinengzhengshu',title:'�Ƿ���ְҵ����֤��',width:200,align:'center'},
					{field:'xinlijiankang',title:'�Ƿ�������',width:200,align:'center'},
					{field:'jiatinglianxiqingkuang',title:'��ͥ��ϵ���',width:200,align:'center'},
					{field:'sanwurenyuan',title:'�Ƿ�������Ա',width:200,align:'center'},
					{field:'weixianxingpinggu',title:'Σ��������',width:200,align:'center'},
					{field:'gaizaobiaoxian',title:'�������',width:200,align:'center'},
					{field:'renzuitaidu',title:'����̬��',width:200,align:'center'},
					{field:'teshuqingkuangbeizhu',title:'�����ڼ����������ע����̽���',width:200,align:'center'},
					{field:'tiqianshifangshuoming',title:'������ǰ�ͷ�˵��',width:200,align:'center'},
					{field:'hechazhuangtai',title:'�˲�״̬',width:200,align:'center'},
					{field:'beizhu',title:'��ע',width:200,align:'center'},
					{field:'huizhi',title:'�Ƿ��л�ִ',width:200,align:'center'},
					{field:'suozaijiansuo',title:'���ڼ���',width:200,align:'center'},
					{field:'shifouyouzhaopian',title:'�Ƿ�����Ƭ',width:200,align:'center'},
					{field:'lurushijian',title:'¼��ʱ��',width:200,align:'center'},
					{field:'hechashijian',title:'�˲�ʱ��',width:200,align:'center'},
					{field:'isRemoved',title:'ɾ����ʶ',width:200,align:'center'},
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
			$("#tt").datagrid("options").url='listImportPersonInfo';
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
			window.open("editImportPersonInfo?id="+id); 
		}
		
		function del(id){
			if(confirm("�Ƿ�ȷ��ɾ����")){
				$.post("deleteImportPersonInfo","id="+id,
	   			   function (data, textStatus){
	   			      alert("ɾ���ɹ���");
	   			      refresh();
	   			   });
			}
		}
		
		
		</script>

</body>

