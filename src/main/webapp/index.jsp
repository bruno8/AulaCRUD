<!DOCTYPE html>
<html>
    <head>
        <title>Lista de Alunos</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <llink rel='stylesheet' href='<%= org.webjars.AssetLocator.getWebJarPath("ccs/bootstrap.min.css")%>'>
        <llink rel='stylesheet' href='<%= org.webjars.AssetLocator.getWebJarPath("ccs/bootstrap-theme.min.css")%>'>
        <style type=text/css">
        #alunos-div{
            height: 250px;
            overflow-y: auto;
        }
        </style>
    </head>
    <body>
        <div>
        <h1>Lista de Alunos</h1>
        <form> 
            <div class="form-group">
                <label class=control-label" for="nomeId">Nome: </label>
                <input class="form-control" id="nomeId" type="text"/>
            </div>
            <div class="form-group">
                <button class="btn btn-primary" type="submit" id="btnAtualiar"</button>
            </div>
        </form>
        <div id="alunos.div">
            <table class="table-striped" id="aluno-table">
                <tr> 
                    <th class="col-xs-2"></th>
                    <th class="col-xs-4">Nome</th>
                </tr>
            </table>
        </div>
        </div>
        <script type='text/javascript' src='<%= org.webjars.AssetLocator.getWebJarPath("jquery.min.js")%>'></script>
        <script type='text/javascript' src='<%= org.webjars.AssetLocator.getWebJarPath("js/bootstrap.min.js")%>'></script>
    </body>
</html>
