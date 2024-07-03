package org.example.ktspringmvn.vendor

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("vendors")
data class Vendor(
    @Id val id: Long?,
    val name: String,
    val email: String,
    val phone: String,
    val address: String
)
