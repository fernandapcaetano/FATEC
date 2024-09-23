// ignore_for_file: prefer_const_constructors

import 'package:flutter/material.dart';

class WidgetHome extends StatelessWidget {
  const WidgetHome({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Hello"),
        centerTitle: true,
      ),
      body: Container(
        color: Colors.white,
        child: Center(
          child: Text("Hello, turma do 5o. SI!",
              style: TextStyle(
                fontSize: 30,
                color: Colors.blue,
                fontWeight: FontWeight.bold,
                fontStyle: FontStyle.italic,
                decoration: TextDecoration.underline,
                //decoration: TextDecoration.overline,
                decorationColor: Colors.red,
                decorationStyle: TextDecorationStyle.dashed,
              )),
        ),
      ),
    );
  }
}
