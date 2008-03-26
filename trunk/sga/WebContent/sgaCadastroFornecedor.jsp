<%-- 
    Document   : sgaCadastroFornecedor
    Created on : 09/12/2007, 21:54:11
    Author     : Hwoarang
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<html>
<head>
<title>sga</title>

<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" href="sga.css" type="text/css" />
<script type="text/JavaScript">
<!--
function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}
//-->
function ValidaFormulario(){
 var erro= "";
 
 if ( document.cadastrarfornecedor.razaosocial.value == "") {
  erro = erro + "Preencha a Raz�o Social \n"
 }
 if ( document.cadastrarfornecedor.endereco.value == "") {
  erro = erro + "Preencha o Endere�o \n"
 }
 if ( document.cadastrarfornecedor.telefone.value == "") {
  erro = erro + "Preencha o Telefone \n"
 }
 if ( document.cadastrarfornecedor.rgie.value == "") {
  erro = erro + "Preencha o RG/IE \n"
 }
 if ( document.cadastrarfornecedor.cpfcnpj.value == "") {
  erro = erro + "Preencha o CPF/CNPJ \n"
 }
 
 if(erro == ""){
  document.cadastrarfornecedor.submit();
 }else{
 	alert(erro);
 }
}

function OnlyNumbers(e)
{
    var tecla=new Number();
 
    if(window.event) {
 tecla = e.keyCode; 
    }
    else if(e.which) {
 tecla = e.which; 
    }
    else {
 return true;
    }
    
    if(((tecla < 48) || (tecla > 57)) && (tecla!=8) )
    {
 return false;
    }
    
}

</script>
</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('images/sga_h_19.gif','images/sga_h_20.gif','images/sga_h_21.gif','images/sga_h_22.gif','images/sga_h_23.gif','images/sga_h_24.gif','images/sga_h_25.gif','images/sga_h_26.gif')">
<form name="cadastrarfornecedor" action="cadastrarfornecedor.do" method="post">
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
					<td height="20" colspan="2" background="images/fundo_box.gif"><img src="images/fornecedores_08.gif" width="115" height="20"><img src="images/sga_h_09.gif" width="109" height="20"></td>
				   <td height="20">&nbsp;</td>
				  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td><div align="center"></div></td>
                    <td  valign="top" bgcolor="a0d7f3" class="CelulaCentro"><table width="95%" border="0" align="center" cellpadding="1" cellspacing="1" bordercolor="#FFFFFF">
                      <tr>
                        <td colspan="4">&nbsp;</td>
                      </tr>
                      <tr>
                        <td width="11%" class="style1">Raz�o Social:</td>
                        <td colspan="3" valign="middle"><input name="razaosocial" type="text" id="razaosocial" size="50" maxlength="45" value="">
                          <a href="#" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image30','','images/btn_buscar_H.gif',1)"></a></td>
                      </tr>
                      <tr>
                        <td class="style1">Endere&ccedil;o:</td>
                        <td colspan="3"><input name="endereco" type="text" id="endereco" size="50" maxlength="60" value=""></td>
                      </tr>
                      <tr>
                        <td class="style1">Telefone:</td>
                        <td colspan="3"><input name="telefone" type="text" id="telefone" size="25" maxlength="25"></td>
                      </tr>
                      <tr>
                        <td class="style1">RG/IE:</td>
                        <td width="30%"><input name="rgie" type="text" id="rgie" size="20" maxlength="20"></td>
                        <td width="18%"><div align="right"><span class="style1">CPF/CNPJ:</span></div></td>
                        <td width="41%"><input name="cpfcnpj" type="text" id="cpfcnpj" size="25" maxlength="14" OnKeyPress="javascript:return OnlyNumbers(event);"></td>
                      </tr>                    
                    </table></td>
                    <td>&nbsp;</td>
                  </tr>
                  <tr>
                    <td>&nbsp;</td>
                    <td width="4">&nbsp;</td>
                    <td width="521" height="37"><div align="right"><img src="images/sga_31.gif" width="72" height="24" alt="Salvar Fornecedor" Onclick="ValidaFormulario();" border="0"> <a href="fornecedor.do"><img src="images/sga_33.gif" width="72" height="24" alt="" border="0"></a></div></td>
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