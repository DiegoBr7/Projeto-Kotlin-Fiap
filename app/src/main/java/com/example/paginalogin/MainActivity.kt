import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
//import com.example.trabalhokotlin.R

@Composable
fun LoginPage() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEFF5F9)) // cor de fundo
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                text = "Login",
                style = TextStyle(
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "Ao fazer login você concorda com nossos Termos e Política de Privacidade",
                style = TextStyle(
                    color = Color(0xFFACB1B4),
                    fontSize = 14.sp,
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = 24.dp)
            )
            Row(
                modifier = Modifier.padding(bottom = 24.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                TextButton(onClick = { /* TODO: Implement Login click */ }) {
                    Text("Login", color = Color(0xFF0066CC))
                }
                Spacer(modifier = Modifier.width(16.dp))
                TextButton(onClick = { /* TODO: Implement Register click */ }) {
                    Text("Registro", color = Color(0xFFACB1B4))
                }
            }
            BasicTextField(
                value = email,
                onValueChange = { email = it },
                decorationBox = { innerTextField ->
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.White)
                            .padding(30.dp)
                    ) {
                        if (email.isEmpty()) {
                            Text(
                                text = "Email ",
                                color = Color(0xFFACB1B4),
                                fontSize = 16.sp
                            )
                        }
                        innerTextField()
                    }
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Email
                ),
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 16.sp
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )
            BasicTextField(
                value = password,
                onValueChange = { password = it },
                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                decorationBox = { innerTextField ->
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.White)
                            .padding(16.dp)
                    ) {
                        if (password.isEmpty()) {
                            Text(
                                text = "Senha",
                                color = Color(0xFFACB1B4),
                                fontSize = 16.sp
                            )
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceAround,
                        ) {
                            innerTextField()
                            IconButton(onClick = { passwordVisible = !passwordVisible }) {
                                Icon(
                                    painter = painterResource(
                                        if (passwordVisible) android.R.drawable.ic_menu_view else android.R.drawable.ic_menu_close_clear_cancel
                                    ),
                                    contentDescription = "Toggle Password Visibility"
                                )
                            }
                        }
                    }
                },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Password
                ),
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 16.sp
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.clickable { /* TODO: Implement Remember Me click */ }
                ) {
                    Checkbox(
                        checked = true,
                        onCheckedChange = { /* TODO: Implement checkbox click */ }
                    )
                    Text("Lembrar Senha")
                }
                Text(
                    text = "esqueci a senha",
                    color = Color(0xFF0066CC),
                    modifier = Modifier.clickable { /* TODO: Implement Forget Password click */ }
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = { /* TODO: Implement Login button click */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),

                ) {
                Text("Login", color = Color.White)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "ou entre com",
                color = Color(0xFFACB1B4),
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                IconButton(onClick = { /* TODO: Implement Social Media login */ }) {

                }
                IconButton(onClick = { /* TODO: Implement Social Media login */ }) {

                }
                IconButton(onClick = { /* TODO: Implement Social Media login */ }) {

                }
                IconButton(onClick = { /* TODO: Implement Social Media login */ }) {

                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = { /* TODO: Implement Touch ID login */ },
                modifier = Modifier
                    .size(72.dp)
                    .clip(RoundedCornerShape(50.dp)),

                ) {

            }
        }
    }
}

@Preview
@Composable
fun LoginPagePreview() {
    LoginPage()
}