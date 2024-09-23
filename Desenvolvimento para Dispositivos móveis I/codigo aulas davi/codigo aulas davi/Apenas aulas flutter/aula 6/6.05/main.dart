// ignore_for_file: prefer_const_constructors

import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(primaryColor: Colors.blue),
      home: Scaffold(
        appBar: AppBar(
          title: Text("'Hello, World' com Flutter"),
          centerTitle: true,
        ),
        body: _body(),
      ),
    );
  }

  _body() {
    return Container(
      color: Colors.white,
      child: Center(
        child: _button(),
      ),
    );
  }

  _button() {
    return ElevatedButton(
      style: ElevatedButton.styleFrom(
        foregroundColor: Colors.amber,
        backgroundColor: Colors.red,
      ),
      onPressed: onClick,
      child: Text(
        "Confirmar",
        style: TextStyle(
          color: Colors.white,
          fontSize: 30,
        ),
      ),
    );
  }

  onClick() {
    print("Clicou aqui");
  }
}
