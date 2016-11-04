<%@ page contentType="text/html; charset=GBK"%>

<head>
<!--  引入jquery的文件（如果check方法未定义，就去掉然后用easyui的表单验证）    -->

<title>下落不明查找编辑页面</title>
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
					<td>录入时间</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"
						value="${missing.lts}" />
					</td>
				</tr>
				<tr>
					<td>对象标识</td>
					<td>
						<input type="text" name="pid" id="pid" class="dfinput"
						value="${missing.pid}" /> 
					</td>
				</tr>
				<tr>
					<td>姓名</td>
					<td>
						<input type="text" name="xingming" id="xingming" class="dfinput"
						value="${missing.xingming}" /> 
					</td>
				</tr>
				<tr>
					<td>区县</td>
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
					<td>街镇</td>
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
					<td>终止类型</td>
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
					<td>年月</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"
						value="${missing.nianyue}" />
					</td>
				</tr>
				<tr>
					<td>下落不明原因</td>
					<td>
						<input type="text" name="yuanyin" id="yuanyin" class="dfinput"
						value="${missing.yuanyin}" /> 
					</td>
				</tr>
				<tr>
					<td>下落不明起时</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"
						value="${missing.qishi}" />
					</td>
				</tr>
				<tr>
					<td>能否联系</td>
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
					<td>曾居住地</td>
					<td>
						<input type="text" name="cengjuzhudi" id="cengjuzhudi" class="dfinput"
						value="${missing.cengjuzhudi}" /> 
					</td>
				</tr>
				<tr>
					<td>信息来源</td>
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
					<td>信息来源其他</td>
					<td>
						<input type="text" name="xinxilaiyuanQita" id="xinxilaiyuanQita" class="dfinput"
						value="${missing.xinxilaiyuanQita}" /> 
					</td>
				</tr>
				<tr>
					<td>已采取查找方式</td>
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
					<td>已采取查找方式其他</td>
					<td>
						<input type="text" name="chazhaofangshiQita" id="chazhaofangshiQita" class="dfinput"
						value="${missing.chazhaofangshiQita}" /> 
					</td>
				</tr>
				<tr>
					<td>通话时间</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"
						value="${missing.tonghuashijian}" />
					</td>
				</tr>
				<tr>
					<td>接电人</td>
					<td>
						<input type="text" name="jiedianren" id="jiedianren" class="dfinput"
						value="${missing.jiedianren}" /> 
					</td>
				</tr>
				<tr>
					<td>通话内容</td>
					<td>
						<input type="text" name="tonghuaneirong" id="tonghuaneirong" class="dfinput"
						value="${missing.tonghuaneirong}" /> 
					</td>
				</tr>
				<tr>
					<td>通话记录人</td>
					<td>
						<input type="text" name="tonghuajiluren" id="tonghuajiluren" class="dfinput"
						value="${missing.tonghuajiluren}" /> 
					</td>
				</tr>
				<tr>
					<td>查访时间</td>
					<td>
						<input type="text" name="birthday" plugin="datepicker"
						value="${missing.chafangshijian}" />
					</td>
				</tr>
				<tr>
					<td>下阶段查找方案</td>
					<td>
						<input type="text" name="xiajieduanchazhaofangan" id="xiajieduanchazhaofangan" class="dfinput"
						value="${missing.xiajieduanchazhaofangan}" /> 
					</td>
				</tr>
				<tr>
					<td>备注</td>
					<td>
						<input type="text" name="beizhu" id="beizhu" class="dfinput"
						value="${missing.beizhu}" /> 
					</td>
				</tr>
				<tr>
					<td>查访地点</td>
					<td>
						<input type="text" name="chafangdidian" id="chafangdidian" class="dfinput"
						value="${missing.chafangdidian}" /> 
					</td>
				</tr>
				<tr>
					<td>查访结果</td>
					<td>
						<input type="text" name="chafangjieguo" id="chafangjieguo" class="dfinput"
						value="${missing.chafangjieguo}" /> 
					</td>
				</tr>
				<tr>
					<td>查访记录人</td>
					<td>
						<input type="text" name="chafangjiluren" id="chafangjiluren" class="dfinput"
						value="${missing.chafangjiluren}" /> 
					</td>
				</tr>
				<tr>
					<td>删除标识</td>
					<td>
						<input type="text" name="removed" id="removed" class="dfinput"
						value="${missing.removed}" /> 
					</td>
				</tr>
				<tr>
					<td>创建人</td>
					<td>
						<input type="text" name="createUserId" id="createUserId" class="dfinput"
						value="${missing.createUserId}" /> 
					</td>
				</tr>
				<tr>
					<td>创建人姓名</td>
					<td>
						<input type="text" name="createUserName" id="createUserName" class="dfinput"
						value="${missing.createUserName}" /> 
					</td>
				</tr>
		</table>
		<input name="" type="button" class="btn" value="确认保存"
			onclick="subForm()" />
	</form>
</body>

