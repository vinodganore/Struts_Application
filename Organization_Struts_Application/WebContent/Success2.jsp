<html>
  <head>
    <script language="Javascript">
      <!--
      var newContent='<html><head><script language="Javascript">function Hi() {alert("Goodbye World");}</script></head><body onload="Hi();">New Content</body></html>';
      function ReplaceContent(NC) {
        document.body.innerHTML=NC;
      }
      function Hi() {
        alert("Hello World");
        ReplaceContent(newContent);
      }
      -->
    </script>
  </head>
  <body onload="Hi();">
    Original Content
  </body>
</html>