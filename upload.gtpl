<html>
<head>
       <title>Upload file</title>
</head>
<body>
<form enctype="multipart/form-data" action="http://localhost:9092/upload" method="POST">
    <input type="file" name="uploadfile" />
    <input type="hidden" name="token" value="{{.}}"/>
    <input type="submit" value="upload" />
</form>
</body>
</html>
