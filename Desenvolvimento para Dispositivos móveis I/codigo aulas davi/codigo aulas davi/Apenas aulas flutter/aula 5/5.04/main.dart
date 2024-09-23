// ignore_for_file: prefer_const_constructors

import 'package:flutter/material.dart';

void main() => runApp(MyProfile());
class MyProfile extends StatelessWidget {
  const MyProfile({Key? key}) : super(key: key);
@override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(primaryColor: Colors.blue),
      home: Scaffold(
        appBar: AppBar(
          title: Text("My profile"),
          backgroundColor: Colors.redAccent,
          centerTitle: true,
        ),
        body: Container(
          color: Colors.white,
          child: Center(
            child: Text(
              "My Profile\nNome: Rubens Lara\nFormação: Tecnólogo em Sistemas para Internet\nDisciplina: DDM1",
              style: TextStyle(
                fontSize: 20,
                color: Colors.cyan,
//                fontWeight: FontWeight.bold,
//                fontStyle: FontStyle.italic,
                decoration: TextDecoration.underline,
//                decorationColor: Colors.red,
//                decorationStyle: TextDecorationStyle.dotted,
              ),
            ),
          ),
        ),
      ),
    );
  }
}
