import 'package:flutter/material.dart';

void main() => runApp(MyApp());

final TextEditingController _controller = TextEditingController();

class MyApp extends StatelessWidget {

  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(primaryColor: Colors.blue),
      home: Scaffold(
        appBar: _titulo(),
        body: _body(),
      ),
    );
  }

  _titulo() {
    return AppBar(
      title: Text("Flutter - TextField"),
      centerTitle: true,
    );
  }

  _body() {
    return Container(
      width: double.infinity,
      color: Colors.white10,
      child: Column(
        mainAxisSize: MainAxisSize.max,
        mainAxisAlignment: MainAxisAlignment.center,
        crossAxisAlignment: CrossAxisAlignment.center,
        children: <Widget>[
          _campo(),
          _botao(),
        ],
      ),
    );
  }

  _campo() {
    return TextField(
      controller: _controller,
      keyboardType: TextInputType.text,
      decoration: InputDecoration(
          labelText: "Digite o seu nome",
          labelStyle: TextStyle(color: Colors.green)),
      textAlign: TextAlign.center,
      style: TextStyle(color: Colors.green, fontSize: 25.0),
    );
  }

  _botao() {
    return ElevatedButton(
      style: ElevatedButton.styleFrom(backgroundColor: Colors.green),
      onPressed: metodoClicar,
      child: Text(
        "OK",
        style: TextStyle(
          color: Colors.white,
          fontSize: 20,
        ),
      ),
    );
  }

  metodoClicar() {
    // print("Clicou aqui");
    String texto = _controller.text;
    print("Seu nome: $texto");
  }
}
