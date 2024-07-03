package org.example.ktspringmvn.vendor

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface VendorRepository : ReactiveCrudRepository<Vendor, Long>
