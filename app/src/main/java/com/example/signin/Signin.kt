package com.example.learinginapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.signin.R


@Preview(showBackground = true)
@Composable
fun SignUp(){
    var phoneNumber by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    var confirmPassword by remember {
        mutableStateOf("")
    }
    Box(modifier = Modifier.fillMaxSize())

    IconButton(onClick = { }, modifier = Modifier.padding(top = 30.dp, start = 30.dp)) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = null,
            modifier = Modifier
                .padding(top = 10.dp)
                .size(30.dp)
        )
    }
    Text(
        text = "Sign in",
        modifier = Modifier.padding(top = 100.dp, start = 40.dp),
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold
    )
    Text(
        text = "Welcome back to your smart Learning Path!",
        modifier = Modifier.padding(top = 150.dp, start = 40.dp, end = 15.dp), fontSize = 27.sp
    )
    TextField(
        value = phoneNumber,
        onValueChange = { phoneNumber = it },
        label = { Text("Phone N0./Email ID") },
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Email
        ),
        modifier = Modifier
            .padding(top = 260.dp, start = 40.dp, end = 40.dp)
            .fillMaxWidth()
    )

    TextField(
        value = password,
        onValueChange = { password = it },
        label = { Text("New Password") },
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Email
        ),
        modifier = Modifier
            .padding(top = 340.dp, start = 40.dp, end = 40.dp)
            .fillMaxWidth()
    )
    TextField(
        value = confirmPassword,
        onValueChange = { confirmPassword = it },
        label = { Text("confirm password") },
        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = KeyboardType.Email
        ),
        modifier = Modifier
            .padding(top = 420.dp, start = 40.dp, end = 40.dp)
            .fillMaxWidth()
    )
    Box(
        modifier = Modifier
            .padding(start = 40.dp, top = 500.dp)
            .width(320.dp)
            .height(60.dp)
            .border(BorderStroke(2.dp, Color.Black), shape = RoundedCornerShape(5.dp))

    ) {
        Button(
            onClick = {  }, modifier = Modifier
                .fillMaxSize()
                .align(Alignment.TopCenter), shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = (Color(0x8BCFCAC1)),
                contentColor = Color.Black,
            )
        ) {
            Text(text = "SIGN UP")
        }
    }

    Text(
        text = "Or continue Sign in with",
        modifier = Modifier.padding(
            top = 600.dp,
            start = 100.dp
        ), fontSize = 18.sp
    )
    Row(modifier = Modifier.padding(top = 650.dp)) {
        Box(
            modifier = Modifier
                .padding(start = 40.dp)
                .width(130.dp)
                .height(60.dp)
                .border(BorderStroke(2.dp, Color.Black), shape = RoundedCornerShape(5.dp))

        ) {
            IconButton(
                onClick = { },
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .size(70.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.rrr),
                    contentDescription = null

                )

            }

        }
        Box(
            modifier = Modifier
                .padding(start = 50.dp)
                .width(130.dp)
                .height(60.dp)
                .border(BorderStroke(2.dp, Color.Black), shape = RoundedCornerShape(5.dp))

        ) {
            IconButton(
                onClick = { },
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .size(70.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.fff),
                    contentDescription = null
                )

            }
        }
    }
    Box(
        modifier = Modifier
            .padding(start = 40.dp, top = 730.dp)
            .width(320.dp)
            .height(60.dp)
            .border(BorderStroke(2.dp, Color.Black), shape = RoundedCornerShape(5.dp))

    ) {
        Button(
            onClick = {  }, modifier = Modifier
                .fillMaxSize()
                .align(Alignment.TopCenter), shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
                contentColor = Color.Black,
            )
        ) {
            Row{
                Text(text = "New to Robo Guru? ")
                Text(text = "SIGN IN", modifier = Modifier, color = Color.Blue)
            }

        }
    }
}