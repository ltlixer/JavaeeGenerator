<%@ page contentType="text/html; charset=${domain.pageEncoding}"%>

<head>
<!--  引入jquery的文件（如果check方法未定义，就去掉然后用easyui的表单验证）    -->

<title>${domain.comments}编辑页面</title>
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
   	   $.post("update${domain.entityName?cap_first}", $("#ff").serialize(),
	   	function (data, textStatus){
	   //		handlerExp(data);
	      	var msg=data.message;
	      	if(msg)
	    	  alert(msg);
	   }, "json");
	   
   }    
       
</script>


	<form id="ff" method="post">
		<input type="hidden" id="id" name="id" value="${'$'}{${domain.entityName}.id}" />
		<#if domain.fkFieldName?? && domain.fkFieldName!=''>
		<input type="hidden" id="${domain.fkFieldName}.id" name="${domain.fkFieldName}.id" value="${'$'}{${domain.entityName}.${domain.fkFieldName}.id}" />
		</#if>
		<table>
			<#list fields as po>
				<#if !po.dbName ?? || po.dbName ==''>
				<#assign name = domain.fkFieldName+'.'+po.name/>
				<#else>
				<#assign name = po.name/>
				</#if>
				<#if po.uiType == 'do not display'>
				<#elseif po.uiType == 'hidden'>
					<input type="hidden" name="${name}" id="${name}" value="${'$'}{${domain.entityName}.${name}}" /> 
				<#else>
				<tr>
					<td>${po.comments}</td>
					<td>
					<#if po.uiType == 'input'>
						<input type="text" name="${name}" id="${name}" class="dfinput<#if po.valid != ''> easyui-validatebox</#if>"
						<#if po.valid !=''>data-options="${po.valid}" </#if>value="${'$'}{${domain.entityName}.${name}}" /> 
					</#if>
					<#if po.uiType == 'select'>
						<select id="${name}" name="${name}" class="easyui-combobox<#if po.valid != ''> easyui-validatebox</#if>" style="width:100%"<#if po.valid !=''>data-options="${po.valid}" </#if>>
                            <option value="invalid" >请填写</option>
                         </select>
					</#if>
					<#if po.uiType == 'password'>
						<input type="password" name="${name}" id="${name}" class="dfinput<#if po.valid != ''> easyui-validatebox</#if>"
						<#if po.valid !=''>data-options="${po.valid}" </#if>value="${'$'}{${domain.entityName}.${name}}" /> 
					</#if>
					<#if po.uiType == 'datepicker'>
						<input type="text" name="birthday" plugin="datepicker"
						value="${'$'}{${domain.entityName}.${name}}" />
					</#if>
					</td>
				</tr>
				</#if>
			</#list>
		</table>
		<input name="" type="button" class="btn" value="确认保存"
			onclick="subForm()" />
	</form>
</body>

