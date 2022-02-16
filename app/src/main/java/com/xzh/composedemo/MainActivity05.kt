package com.xzh.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.xzh.composedemo.ui.theme.ComposeDemoTheme

/**
 * 通过modifier属性调整细节
 */
class MainActivity05 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Message(name = "Haha")


        }
    }


    /**
     * 定义一个组件，组件的概念相当于一个视图，里面可能包含很多控件。相对于整个页面的一部分，比如导航部分
     * 可以单独写成一个组件。这里只是简单写一个Text文件控件。
     */
    @Composable
    fun Message(user: User) {
        Row(modifier = Modifier.padding(10.dp)) {
            //图片设置为圆形
            Image(
                //不能传mipmap，会告诉你不支持
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(50.dp)
            )
            Column() {
                Text(
                    text = "${user.name}",
                )
                //距离上个Text 10dp
                Text(
                    text = "${user.age}",
                    modifier = Modifier
                        .padding(0.dp, 10.dp, 0.dp, 0.dp)
                )
            }
        }


    }


    /**
     * 这个功能和setContext是重复的，只是这个是预览，setContent是部署到机器上。
     * 可以写一个然后拷贝过去。也可以就用一个功能。相当于main函数。
     */
    @Preview
    @Composable
    fun PreviewMessage() {
        //相对于main函数第一行代码
            Message(User("张三", 20))
    }

    /**
     * 相当于Java Bean
     */
    data class User(val name: String, val age: Int)

}

