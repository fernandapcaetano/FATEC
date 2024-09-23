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
            title: Text("Hello world, SI!"),
            backgroundColor: Colors.redAccent,
            centerTitle: true,
          ),
          body: Container(
            color: Colors.white,
            child: ListView(
              children: [
                Text(
                  "Nome: Rubens Lara",
                  style: TextStyle(
                    fontSize: 20,
                    color: Colors.blue
                  ),
                ),
                Text("Formação: Sistemas para Internet"),
                Text("Disciplina: DDM1 (Flutter)"),
              ],
            ),
          ),
        ));
  }
}
