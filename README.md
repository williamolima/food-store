# food-store

Padrão Strategy no pacote <i>log</i>.

Teremos dois tipos de envio para o servidor, em um tipo é enviado um objeto para ser adicionado ao banco de dados, em outro, um arquivo que será armazenado. Para diferenciar esses dois recursos, e eliminar as condições <i>if</i> e <i>else</i>, faremos isso utilizando uma interface geraddora, e dois diferentes médotos como rota.
