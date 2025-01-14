package com.example.contactos
import UserApp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.contactos.DAO.UserDao
import com.example.contactos.DataBase.UserDatabase
import com.example.contactos.Repository.UserRepository


class MainActivity : ComponentActivity() {
    private lateinit var userDao: UserDao
    private lateinit var userRepository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val db = UserDatabase.getDatabase(applicationContext)
        userDao = db.UserDao()
        userRepository = UserRepository(userDao)

        enableEdgeToEdge()
        setContent{

            UserApp(userRepository)
        }
    }
}