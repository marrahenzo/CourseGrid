package com.example.coursegrid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coursegrid.data.Topic
import com.example.coursegrid.ui.theme.CourseGridTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CourseGridTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    CourseGrid()
                }
            }
        }
    }
}

@Composable
fun CourseGrid(modifier: Modifier = Modifier) {

}

@Composable
fun CourseTopic(topic: Topic, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .clip(shape = RoundedCornerShape(10.dp))
            .height(68.dp)
    ) {
        Image(
            painter = painterResource(id = topic.image),
            contentDescription = stringResource(id = topic.title),
            modifier = modifier.size(68.dp)
        )
        Column(
            modifier = modifier
                .background(color = Color(200, 200, 200))
                .fillMaxHeight()
                .padding(top = 16.dp, end = 16.dp)
        ) {
            Text(
                text = stringResource(id = topic.title),
                style = MaterialTheme.typography.labelLarge,
                modifier = modifier.padding(start = 16.dp, bottom = 8.dp)
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_grain),
                    contentDescription = null,
                    modifier = modifier.padding(start = 16.dp)
                )
                Text(
                    text = topic.amountOfCourses.toString(),
                    style = MaterialTheme.typography.labelLarge,
                    modifier = modifier.padding(start = 8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CourseTopicPreview() {
    CourseGridTheme {
        CourseTopic(
            Topic(
                R.string.photography, 321, R.drawable.photography
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CourseGridPreview() {
    CourseGridTheme {
        CourseGrid()
    }
}