package com.devin.app.vendor

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface VendorRepository : ReactiveCrudRepository<Vendor, Long>
