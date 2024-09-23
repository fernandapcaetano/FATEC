// ignore_for_file: prefer_const_constructors
import 'package:flutter/material.dart';

class WidgetHome extends StatelessWidget {
  const WidgetHome({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Hello, world do 5º de SI"),
        centerTitle: true,
      ),
      body: Container(
        color: Colors.orange,
      ),
    );
  }
}
