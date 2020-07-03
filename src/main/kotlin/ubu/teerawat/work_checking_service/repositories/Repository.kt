package ubu.teerawat.work_checking_service.repositories

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import ubu.teerawat.work_checking_service.models.CheckModel
import ubu.teerawat.work_checking_service.models.UserModel


@RepositoryRestResource(collectionResourceRel = "user", path = "user") interface UserRepository : PagingAndSortingRepository<UserModel, String>
@RepositoryRestResource(collectionResourceRel = "check", path = "check") interface CheckRepository : PagingAndSortingRepository<CheckModel, String>