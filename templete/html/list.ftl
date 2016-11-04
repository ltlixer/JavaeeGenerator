<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>${domain.name}列表</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../Scripts/jquery.min.js"></script>
</head>

<body>

<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td>&nbsp;</td>
  </tr>
</table>

<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td class="all_title_left">&nbsp;</td>
    <td class="all_title_bg">${domain.name}</td>
    <td class="all_title_right">&nbsp;</td>
  </tr>
</table>

<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0" class="all_content">
  <tr>
    <td valign="top">
    <div class="search">
      <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
        <#assign index = 0 />
        <#list fields as po>
        <#if po.search == 'true'>
          <#if (index%3)==0>
          <tr>
          </#if> 
          <td height="35" align="right">${po.name}：</td>
          <td>
          <#if po.type=='input'>
          <input type="text" class="search_input" style="width:185px;" />
          <#elseif po.type=='radio'>
          <input type="radio" name="${po.name}" checked="checked" />是 
          <input type="radio" name="${po.name}" /> 否
          <#elseif po.type=='select'>
          <select class="search_select"  style="width:185px;">
    		<option>请选择</option>
      		<#list po.datas as data>
      		<option>${data}</option>
      		</#list>
    	  </select>
          <#elseif po.type=='textarea'>
          <input type="text" class="search_input" style="width:185px;" />
          <#else>
          		不支持
          </#if>
          </td>
          <#if (index+1)%3==0>
          </tr>
          </#if>
         <#assign index = index+1 />
         </#if>
         </#list>
        <tr>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
          <td><input type="submit" name="button" class="button_bg" value="搜索" /></td>
        </tr>
        </table>
    </div>
    
    <table width="96%" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td>&nbsp;</td>
      </tr>
    </table>
    
<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="tablelist">
  <thead>
  <tr>
  	  <th>序号</th>
	  <#list fields as po>
	  <#if po.list == 'true'>
	  <th>${po.name}</th>
	  </#if>
	  </#list>
	  <th>操作</th>
  </tr>
  </thead>
  <tbody>
  <#list 1..10 as index>
  <tr>
  	<td align="center">${index}</td>
  	<#list fields as po>
  	<#if po.list == 'true'>
	<td align="center">
	<#if po.type == 'radio'>
		<#if index%2==0>
		是
		<#else>
		否
		</#if>
	<#else>
		<#list po.datas as data>
			<#if data_index==(index-1)%(po.datas?size)>
			${data}
			</#if>
		</#list>
	</#if>
	</td>
	</#if>
	</#list>
  	<td align="center"><a href="${fileName}Content.html" class="tablelink">查看</a></td>
  </tr>
  </#list>
  </tbody>
</table>

    <table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td colspan="2" height="10"></td>
        </tr>
      <tr>
        <td width="50%">
        <input type="submit" name="button2" class="button_bg" value="上报" 
onClick="window.location.href='${fileName}Content.html'" />
        &nbsp;
          <input type="submit" name="button3" class="button_bg" value="导出" />
          </td>
        <td width="50%">
        <ul class="pages">
        <li><a href="#"><<</a></li>
        <li><a href="#" class="selected">1</a></li>
        <li><a href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#">4</a></li>
        <li><a href="#">5</a></li>
        <li><a href="#">>></a></li>
        </ul>
        </td>
      </tr>
      <tr>
        <td colspan="2" height="10"></td>
        </tr>
    </table>
    
    </td>
  </tr>
</table>

<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td>&nbsp;</td>
  </tr>
</table>

 <script type="text/javascript">
	$('.tablelist tbody tr:odd').addClass('odd');
	</script>
    
</body>
</html>
