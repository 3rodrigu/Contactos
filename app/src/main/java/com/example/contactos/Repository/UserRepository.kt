package com.example.contactos.Repository

import com.example.contactos.DAO.UserDao
import com.example.contactos.Model.User


class UserRepository (private val userDao: UserDao){
    suspend fun insert(user: User){
        userDao.insert(user)
    }
    suspend fun getAllUsers(): List<User> {
        return userDao.getAllUsers()
    }
    suspend fun deleteById(userId: Int): Int{
        return userDao.deleteById(userId)
    }
    suspend fun updateById(userId: Int, nombre: String, apellido: String, edad: Int): Int {
        return userDao.updateById(userId, nombre, apellido, edad)
    }

}