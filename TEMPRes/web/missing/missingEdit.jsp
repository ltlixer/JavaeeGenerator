<%@ page contentType="text/html; charset=GBK"%>

<head>
<!--  ����jquery���ļ������check����δ���壬��ȥ��Ȼ����easyui�ı���֤��    -->

<title>���䲻�����ұ༭ҳ��</title>
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
   	   $.post("updateMissing", $("#ff").serialize(),
	   	function (data, textStatus){
	   //		handlerExp(data);
	      	var msg=data.message;
	      	if(msg)
	    	  alert(msg);
	   }, "json");
	   
   }    
       
</script>


	<form id="ff" method="post">
		<input type="hidden" id="id" name="id" value="${missing.id}" />
		<table>
				<tr>
					<td>ID</td>
					<td>
						<input type="text" name="isRemoved" id="isRemoved" class="dfinput"
						value="${missing.isRemoved}" /> 
					</td>
				</tr>
				<tr>
					<td>¼��ʱ��</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"
						value="${missing.lts}" />
					</td>
				</tr>
				<tr>
					<td>�����ʶ</td>
					<td>
						<input type="text" name="pid" id="pid" class="dfinput"
						value="${missing.pid}" /> 
					</td>
				</tr>
				<tr>
					<td>����</td>
					<td>
						<input type="text" name="xingming" id="xingming" class="dfinput"
						value="${missing.xingming}" /> 
					</td>
				</tr>
				<tr>
					<td>����</td>
					<td>
						<input type="text" name="quxianCode" id="quxianCode" class="dfinput"
						value="${missing.quxianCode}" /> 
					</td>
				</tr>
				<tr>
					<td>QUXIAN_TEXT</td>
					<td>
						<input type="text" name="quxianText" id="quxianText" class="dfinput"
						value="${missing.quxianText}" /> 
					</td>
				</tr>
				<tr>
					<td>����</td>
					<td>
						<input type="text" name="jiezhenCode" id="jiezhenCode" class="dfinput"
						value="${missing.jiezhenCode}" /> 
					</td>
				</tr>
				<tr>
					<td>JIEZHEN_TEXT</td>
					<td>
						<input type="text" name="jiezhenText" id="jiezhenText" class="dfinput"
						value="${missing.jiezhenText}" /> 
					</td>
				</tr>
				<tr>
					<td>��ֹ����</td>
					<td>
						<input type="text" name="jibieCode" id="jibieCode" class="dfinput"
						value="${missing.jibieCode}" /> 
					</td>
				</tr>
				<tr>
					<td>JIBIE_TEXT</td>
					<td>
						<input type="text" name="jibieText" id="jibieText" class="dfinput"
						value="${missing.jibieText}" /> 
					</td>
				</tr>
				<tr>
					<td>����</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"
						value="${missing.nianyue}" />
					</td>
				</tr>
				<tr>
					<td>���䲻��ԭ��</td>
					<td>
						<input type="text" name="yuanyin" id="yuanyin" class="dfinput"
						value="${missing.yuanyin}" /> 
					</td>
				</tr>
				<tr>
					<td>���䲻����ʱ</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"
						value="${missing.qishi}" />
					</td>
				</tr>
				<tr>
					<td>�ܷ���ϵ</td>
					<td>
						<input type="text" name="nengfoulianxiCode" id="nengfoulianxiCode" class="dfinput"
						value="${missing.nengfoulianxiCode}" /> 
					</td>
				</tr>
				<tr>
					<td>NENGFOULIANXI_TEXT</td>
					<td>
						<input type="text" name="nengfoulianxiText" id="nengfoulianxiText" class="dfinput"
						value="${missing.nengfoulianxiText}" /> 
					</td>
				</tr>
				<tr>
					<td>����ס��</td>
					<td>
						<input type="text" name="cengjuzhudi" id="cengjuzhudi" class="dfinput"
						value="${missing.cengjuzhudi}" /> 
					</td>
				</tr>
				<tr>
					<td>��Ϣ��Դ</td>
					<td>
						<input type="text" name="xinxilaiyuanCode" id="xinxilaiyuanCode" class="dfinput"
						value="${missing.xinxilaiyuanCode}" /> 
					</td>
				</tr>
				<tr>
					<td>XINXILAIYUAN_TEXT</td>
					<td>
						<input type="text" name="xinxilaiyuanText" id="xinxilaiyuanText" class="dfinput"
						value="${missing.xinxilaiyuanText}" /> 
					</td>
				</tr>
				<tr>
					<td>��Ϣ��Դ����</td>
					<td>
						<input type="text" name="xinxilaiyuanQita" id="xinxilaiyuanQita" class="dfinput"
						value="${missing.xinxilaiyuanQita}" /> 
					</td>
				</tr>
				<tr>
					<td>�Ѳ�ȡ���ҷ�ʽ</td>
					<td>
						<input type="text" name="chazhaofangshiCode" id="chazhaofangshiCode" class="dfinput"
						value="${missing.chazhaofangshiCode}" /> 
					</td>
				</tr>
				<tr>
					<td>CHAZHAOFANGSHI_TEXT</td>
					<td>
						<input type="text" name="chazhaofangshiText" id="chazhaofangshiText" class="dfinput"
						value="${missing.chazhaofangshiText}" /> 
					</td>
				</tr>
				<tr>
					<td>�Ѳ�ȡ���ҷ�ʽ����</td>
					<td>
						<input type="text" name="chazhaofangshiQita" id="chazhaofangshiQita" class="dfinput"
						value="${missing.chazhaofangshiQita}" /> 
					</td>
				</tr>
				<tr>
					<td>ͨ��ʱ��</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"
						value="${missing.tonghuashijian}" />
					</td>
				</tr>
				<tr>
					<td>�ӵ���</td>
					<td>
						<input type="text" name="jiedianren" id="jiedianren" class="dfinput"
						value="${missing.jiedianren}" /> 
					</td>
				</tr>
				<tr>
					<td>ͨ������</td>
					<td>
						<input type="text" name="tonghuaneirong" id="tonghuaneirong" class="dfinput"
						value="${missing.tonghuaneirong}" /> 
					</td>
				</tr>
				<tr>
					<td>ͨ����¼��</td>
					<td>
						<input type="text" name="tonghuajiluren" id="tonghuajiluren" class="dfinput"
						value="${missing.tonghuajiluren}" /> 
					</td>
				</tr>
				<tr>
					<td>���ʱ��</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"
						value="${missing.chafangshijian}" />
					</td>
				</tr>
				<tr>
					<td>�½׶β��ҷ���</td>
					<td>
						<input type="text" name="xiajieduanchazhaofangan" id="xiajieduanchazhaofangan" class="dfinput"
						value="${missing.xiajieduanchazhaofangan}" /> 
					</td>
				</tr>
				<tr>
					<td>��ע</td>
					<td>
						<input type="text" name="beizhu" id="beizhu" class="dfinput"
						value="${missing.beizhu}" /> 
					</td>
				</tr>
				<tr>
					<td>��õص�</td>
					<td>
						<input type="text" name="chafangdidian" id="chafangdidian" class="dfinput"
						value="${missing.chafangdidian}" /> 
					</td>
				</tr>
				<tr>
					<td>��ý��</td>
					<td>
						<input type="text" name="chafangjieguo" id="chafangjieguo" class="dfinput"
						value="${missing.chafangjieguo}" /> 
					</td>
				</tr>
				<tr>
					<td>��ü�¼��</td>
					<td>
						<input type="text" name="chafangjiluren" id="chafangjiluren" class="dfinput"
						value="${missing.chafangjiluren}" /> 
					</td>
				</tr>
				<tr>
					<td>ɾ����ʶ</td>
					<td>
						<input type="text" name="removed" id="removed" class="dfinput"
						value="${missing.removed}" /> 
					</td>
				</tr>
				<tr>
					<td>������</td>
					<td>
						<input type="text" name="createUserId" id="createUserId" class="dfinput"
						value="${missing.createUserId}" /> 
					</td>
				</tr>
				<tr>
					<td>����������</td>
					<td>
						<input type="text" name="createUserName" id="createUserName" class="dfinput"
						value="${missing.createUserName}" /> 
					</td>
				</tr>
		</table>
		<input name="" type="button" class="btn" value="ȷ�ϱ���"
			onclick="subForm()" />
	</form>
</body>

