<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>sga</title>

<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" href="sga.css" type="text/css" />
<link rel="stylesheet" href="displaytag.css" type="text/css" />

<script type="text/JavaScript">
<!--
function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
//-->
</script>
</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('images/sga_h_19.gif','images/sga_h_20.gif','images/sga_h_21.gif','images/sga_h_22.gif','images/sga_h_23.gif','images/sga_h_24.gif','images/sga_h_25.gif','images/sga_h_26.gif')">
<form name="aluno" action="aluno.do" method="post">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>    
    <td width="85%" rowspan="4" valign="top">
         <table width="100%"  border="0" cellpadding="0" cellspacing="0">
           <tr>
             <td height="26" colspan="3" background="images/fundo_topo.gif"><img src="images/sga_02.gif" width="115" height="36" alt=""><img src="images/sga_03.gif" width="117" height="36" alt=""><img src="images/sga_04.gif" width="124" height="36" alt=""><img src="images/sga_05.gif" width="111" height="36" alt=""><img src="images/sga_06.gif" width="107" height="36" alt=""></td>       
           </tr>
           <tr>
             <td> 
                <table width="95%" height="360" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td width="11" height="20">&nbsp;</td>
                    <td height="20" colspan="2" background="images/fundo_box.gif" bgcolor="#434037">
                      <img src="images/sga_08.gif" width="115" height="20" alt="">
                    </td>
                    <td height="20">&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><div align="center"></div></td>
                    <td  valign="top" bgcolor="a0d7f3" class="CelulaCentro">
                         
                        <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF">         
                            <tr valign="bottom">
                                <td colspan="3">
                                <a href="sgaCadastroAluno.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image31','','images/btn_cadastrar_h.gif',1)"><img src="images/btn_cadastrar.gif" name="Image31" width="111" height="24" border="0"></a><br><a href="#" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('999','','images/btn_buscar_H.gif',1)"></a></td>
                            </tr>
                            <tr>
                                <td width="12%" class="style1" height="24">Busca:</td>
                                <td height="24">
                                                                           
                                        <input name="buscanome" type="text" size="50" maxlength="100" value="${busca}">
                                   
                                </td>        
                                <td width="88%" colspan="3" height="24">        
                                        <a href="Javascript:document.aluno.submit()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image30','','images/btn_buscar_H.gif',1)">
                                        <img src="images/btn_buscar.gif" name="Image30" width="72" height="24" border="0"></a>
                                    
                                </td>
                            </tr>
                            <tr>
                                <td class="style1">&nbsp;</td>
                                <td colspan="3">&nbsp;</td>
                            </tr>
                            <tr>
                                <td colspan="4" class="style1"><a href="#" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image30','','images/btn_buscar_H.gif',1)"></a>
                                    <!-- 
                                    <display:table name="alunoList" class="displaytag">                                      
                                      <display:column property="nome"    title="Alunos" href="editaaluno.do" paramId="cod"  paramProperty="codigo" />   
                                      
                                    </display:table>
                                     -->                          
                              
                                    <a href="#" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image30','','images/btn_buscar_H.gif',1)"></a>
                                </td>
                            </tr>
                        
                        </table>
                    </td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td width="4">&nbsp;</td>
                    <td width="521" height="37"><div align="right"></div></td>
                    <td width="250"><div align="right"></div></td>
                  </tr>
                </table>
             </td>
           </tr>           
         </table>
    </td>
  </tr>
</table>
</form>
</body>

</html>