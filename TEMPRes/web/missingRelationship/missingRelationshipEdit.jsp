<%@ page contentType="text/html; charset=GBK"%>

<head>
<!--  引入jquery的文件（如果check方法未定义，就去掉然后用easyui的表单验证）    -->

<title>下落不明查找 社会关系编辑页面</title>
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
					<td>下落不明查找ID</td>
					<td>
						<input type="text" name="bid" id="bid" class="dfinput"
						value="${missingRelationship.bid}" /> 
					</td>
				</tr>
				<tr>
					<td>姓名</td>
					<td>
						<input type="text" name="xingming" id="xingming" class="dfinput"
						value="${missingRelationship.xingming}" /> 
					</td>
				</tr>
				<tr>
					<td>关系</td>
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
					<td>联系方式</td>
					<td>
						<input type="text" name="lianxifangshi" id="lianxifangshi" class="dfinput"
						value="${missingRelationship.lianxifangshi}" /> 
					</td>
				</tr>
		</table>
		<input name="" type="button" class="btn" value="确认保存"
			onclick="subForm()" />
	</form>
</body>

