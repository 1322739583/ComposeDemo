package com.xzh.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.xzh.composedemo.ui.theme.ComposeDemoTheme

/**
 * 最简单的例子
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //相当于main函数
        setContent {
           // Message(name = "Haha")
        }
    }


/**
 * 定义一个组件，组件的概念相当于一个视图，里面可能包含很多控件。相对于整个页面的一部分，比如导航部分
 * 可以单独写成一个组件。这里只是简单写一个Text文件控件。
 */
@Composable
fun Message(name:String){
    Text(text = "Hello $name")
}

/**
 * 这个功能和setContext是重复的，只是这个是预览，setContent是部署到机器上。
 * 可以写一个然后拷贝过去。也可以就用一个功能。相当于main函数。
 * 不能预览请看build输出信息，一般是版本不对造成的
 * classpath 'org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.10'
 */
@Preview
@Composable
fun PreviewMessage(){
    //相对于main函数第一行代码
    Message(name = "Java Compose")
}

}

 