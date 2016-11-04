<%@ page contentType="text/html; charset=GBK"%>

<head>
<!--  需要引入必要的js文件，这里需要jquery基本js文件，以及easyui所需要的文件    -->
<title>安置帮教导入原始信息表列表</title>

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
	     	<td><input name="button" type='button' class="button_style" onclick="javascript:subSearchBut()" value='查询' /></td>		
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
				title:'安置帮教导入原始信息表',
				pagination:true,
				sortOrder: 'asc',
				idField:'id',
				loadMsg:'正在查询，请稍等...',
				fit: true,
		//		onLoadSuccess:handlerExp(),
				fitColumns: true,
				columns:[[
					{field:'id',title:'标识',width:200,align:'center'},
					{field:'lts',title:'导入时间',width:200,align:'center'},
					{field:'pid',title:'与人员基本信息关联id',width:200,align:'center'},
					{field:'xingming',title:'姓名',width:200,align:'center'},
					{field:'daorulaiyuan',title:'导入来源',width:200,align:'center'},
					{field:'cengyongming',title:'曾用名',width:200,align:'center'},
					{field:'xingbie',title:'性别',width:200,align:'center'},
					{field:'shenfenzheng',title:'身份证号',width:200,align:'center'},
					{field:'chushengriqi',title:'出生日期',width:200,align:'center'},
					{field:'minzu',title:'民族',width:200,align:'center'},
					{field:'wenhuachengdu',title:'文化程度',width:200,align:'center'},
					{field:'nongcunji',title:'是否农村籍',width:200,align:'center'},
					{field:'hujidizhi',title:'户籍地址',width:200,align:'center'},
					{field:'tiqianshifang',title:'是否提前释放',width:200,align:'center'},
					{field:'shifangshijian',title:'释放时间',width:200,align:'center'},
					{field:'zuiming',title:'罪名',width:200,align:'center'},
					{field:'xingqi',title:'刑期',width:200,align:'center'},
					{field:'fujiaxing',title:'附加刑',width:200,align:'center'},
					{field:'leifan',title:'是否累犯',width:200,align:'center'},
					{field:'xidushi',title:'吸毒史',width:200,align:'center'},
					{field:'zhiyejinengpeixun',title:'是否参加职业技能培训',width:200,align:'center'},
					{field:'zhiyejinengzhengshu',title:'是否获得职业技能证书',width:200,align:'center'},
					{field:'xinlijiankang',title:'是否心理健康',width:200,align:'center'},
					{field:'jiatinglianxiqingkuang',title:'家庭联系情况',width:200,align:'center'},
					{field:'sanwurenyuan',title:'是否三无人员',width:200,align:'center'},
					{field:'weixianxingpinggu',title:'危险性评估',width:200,align:'center'},
					{field:'gaizaobiaoxian',title:'改造表现',width:200,align:'center'},
					{field:'renzuitaidu',title:'认罪态度',width:200,align:'center'},
					{field:'teshuqingkuangbeizhu',title:'服刑期间特殊情况备注及帮教建议',width:200,align:'center'},
					{field:'tiqianshifangshuoming',title:'减刑提前释放说明',width:200,align:'center'},
					{field:'hechazhuangtai',title:'核查状态',width:200,align:'center'},
					{field:'beizhu',title:'备注',width:200,align:'center'},
					{field:'huizhi',title:'是否有回执',width:200,align:'center'},
					{field:'suozaijiansuo',title:'所在监所',width:200,align:'center'},
					{field:'shifouyouzhaopian',title:'是否有照片',width:200,align:'center'},
					{field:'lurushijian',title:'录入时间',width:200,align:'center'},
					{field:'hechashijian',title:'核查时间',width:200,align:'center'},
					{field:'isRemoved',title:'删除标识',width:200,align:'center'},
 					{field:'operate',title:'操作',width:200,align:'center',formatter:function(value,rowData,rowIndex){
 	                        var c="";
 	                        c+="<a href=\"javascript:viewDetail('"+rowData.id+"');\" > 修改</a> | <a href=\"javascript:del('"+rowData.id+"');\" > 删除</a>";
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
			//显示第一页数据 
			$("#tt").datagrid("options").pageNumber = 1;  
			//分页栏上跳转到第一页  
			$("#tt").datagrid('getPager').pagination({pageNumber: 1});  
			subSearch();
		}
		
		function viewDetail(id){
			window.open("editImportPersonInfo?id="+id); 
		}
		
		function del(id){
			if(confirm("是否确定删除？")){
				$.post("deleteImportPersonInfo","id="+id,
	   			   function (data, textStatus){
	   			      alert("删除成功！");
	   			      refresh();
	   			   });
			}
		}
		
		
		</script>

</body>

