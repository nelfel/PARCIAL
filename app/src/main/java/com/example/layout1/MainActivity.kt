import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var usernameEditText: EditText? = null
    private var passwordEditText: EditText? = null
    private var loginButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameEditText = findViewById<EditText>(R.id.usernameEditText)
        passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener(View.OnClickListener {
            val username = usernameEditText.getText().toString()
            val password = passwordEditText.getText().toString()

            
            if (username == "usuario" && password == "contraseña") {
                Toast.makeText(this@MainActivity, "Inicio de sesión exitoso", Toast.LENGTH_SHORT)
                    .show()
            } else {
                Toast.makeText(
                    this@MainActivity,
                    "Nombre de usuario o contraseña incorrectos",
                    Toast.LENGTH_SHORT
                ).show()
                val tkambioButton = findViewById<Button>(R.id.tkambioButton)
                val edadButton = findViewById<Button>(R.id.edadButton)
                val contactosButton = findViewById<Button>(R.id.contactosButton)

                tkambioButton.setOnClickListener {

                }

                edadButton.setOnClickListener {

                }

                contactosButton.setOnClickListener {

                }

            }
        })
    }
}