package ubu.teerawat.work_checking_service.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document data class UserModel(@Id val id:String, val firstName:String, val lastName:String, val mobile:String)
@Document data class CheckModel(@Id val id:String, val checkin:Date, val checkout:Date, val user:UserModel)