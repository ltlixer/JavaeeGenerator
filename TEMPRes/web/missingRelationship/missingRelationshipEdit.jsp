<%@ page contentType="text/html; charset=GBK"%>

<head>
<!--  ����jquery���ļ������check����δ���壬��ȥ��Ȼ����easyui�ı���֤��    -->

<title>���䲻������ ����ϵ�༭ҳ��</title>
</head>

<body>

<script type="text/javascript">
	var vForm;
	$(document).ready(function(){
	//	var vForm=$("#ff").Validform({tiptype:3});
			var vForm=$("#ff")
	}); 
	
	function validSelect(obj){
		$("input[name='"+$(obj).attr('id')+"']").attr('datatype',$(obj).attr('datatype'));
		$("input[name='"+$(obj).attr('id')+"']").attr('errormsg',$(obj).attr('errormsg'));
		$("input[name='"+$(obj).attr('id')+"']").attr('nullmsg',$(obj).attr('nullmsg'));
		vForm.check(false);
	}
	
   function subForm(){
   	   $.post("updateMissingRelationship", $("#ff").serialize(),
	   	function (data, textStatus){
	   //		handlerExp(data);
	      	var msg=data.message;
	      	if(msg)
	    	  alert(msg);
	   }, "json");
	   
   }    
       
</script>


	<form id="ff" method="post">
		<input type="hidden" id="id" name="id" value="${missingRelationship.id}" />
		<table>
				<tr>
					<td>ID</td>
					<td>
						<input type="text" name="id" id="id" class="dfinput"
						value="${missingRelationship.id}" /> 
					</td>
				</tr>
				<tr>
					<td>���䲻������ID</td>
					<td>
						<input type="text" name="bid" id="bid" class="dfinput"
						value="${missingRelationship.bid}" /> 
					</td>
				</tr>
				<tr>
					<td>����</td>
					<td>
						<input type="text" name="xingming" id="xingming" class="dfinput"
						value="${missingRelationship.xingming}" /> 
					</td>
				</tr>
				<tr>
					<td>��ϵ</td>
					<td>
						<input type="text" name="guanxiCode" id="guanxiCode" class="dfinput"
						value="${missingRelationship.guanxiCode}" /> 
					</td>
				</tr>
				<tr>
					<td>GUANXI_TEXT</td>
					<td>
						<input type="text" name="guanxiText" id="guanxiText" class="dfinput"
						value="${missingRelationship.guanxiText}" /> 
					</td>
				</tr>
				<tr>
					<td>��ϵ��ʽ</td>
					<td>
						<input type="text" name="lianxifangshi" id="lianxifangshi" class="dfinput"
						value="${missingRelationship.lianxifangshi}" /> 
					</td>
				</tr>
		</table>
		<input name="" type="button" class="btn" value="ȷ�ϱ���"
			onclick="subForm()" />
	</form>
</body>

