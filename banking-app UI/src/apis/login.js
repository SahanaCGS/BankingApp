const axios = require('axios')

export const DO_LOGIN= async () => {
  try {
    return await axios.get('http://localhost:8080/bankingApp/login')
  } catch (error) {
    console.error(error)
  }
}