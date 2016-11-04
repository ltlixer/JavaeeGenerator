<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>${domain.name}编辑内容</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../Scripts/jquery.min.js"></script>
</head>

<body>

<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td>&nbsp;</td>
  </tr>
</table>

<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0" class="content_all_title">
  <tr>
    <td width="10%" align="center" class="title">${domain.name}详情</td>
    <td width="90%" class="line">&nbsp;</td>
  </tr>
</table>

<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td>&nbsp;</td>
  </tr>
</table>

<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
  <#list fields as po>
  <#if po.type=='meta'>
  <#else>
  <tr>
    <td width="9%" height="40" align="right" class="content_left">${po.name}</td>
    <td width="91%" class="content_right">
    	<#if po.type=='input'>
    	<input type="text" name="textfield" class="input_bg" style="width:70%;" value="<#list po.datas as data><#if data_index == 0>${data}</#if></#list>" />
    	<#elseif po.type=='radio'>
    	<input type="radio" name="${po.name}" checked="checked" />是 
        <input type="radio" name="${po.name}" /> 否
    	<#elseif po.type=='select'>
    	<select class="select_bg"  style="width:71%;">
    		<option>请选择</option>
      		<#list po.datas as data>
      		<option>${data}</option>
      		</#list>
    	</select>
    	<#elseif po.type=='textarea'>
    	<textarea class="textarea_bg"  rows="8" style="width:70%;" ></textarea>
    	<#elseif po.type=='paragraph'>
    	<p><#list po.datas as data><#if data_index == 0>${data}</#if></#list></p>
    	<#else>
    		不支持
    	</#if>
    </td>
  </tr>
  </#if>
  </#list>
</table>

<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="9%">&nbsp;</td>
    <td width="91%">&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td class="buttons"><input type="submit" name="button" class="button_bg" value="立刻提交"  
onClick="window.location.href='${fileName}List.html'"/></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>

</body>
</html>
