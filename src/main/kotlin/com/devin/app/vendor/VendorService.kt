package com.devin.app.vendor

import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class VendorService(private val vendorRepository: VendorRepository) {

    fun getAllVendors(): Flux<Vendor> {
        return vendorRepository.findAll()
    }

    fun getVendorById(id: Long): Mono<Vendor> {
        return vendorRepository.findById(id)
    }

    fun createVendor(vendor: Vendor): Mono<Vendor> {
        return vendorRepository.save(vendor)
    }

    fun updateVendor(id: Long, vendor: Vendor): Mono<Vendor> {
        return vendorRepository.findById(id)
            .flatMap {
                val updatedVendor = it.copy(
                    name = vendor.name,
                    email = vendor.email,
                    phone = vendor.phone,
                    address = vendor.address
                )
                vendorRepository.save(updatedVendor)
            }
    }

    fun deleteVendor(id: Long): Mono<Void> {
        return vendorRepository.deleteById(id)
    }
}
