package com.devin.app.vendor

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/vendors")
class VendorController(private val vendorService: VendorService) {

    @GetMapping
    fun getAllVendors(): Flux<Vendor> {
        return vendorService.getAllVendors()
    }

    @GetMapping("/{id}")
    fun getVendorById(@PathVariable id: Long): Mono<Vendor> {
        return vendorService.getVendorById(id)
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createVendor(@RequestBody vendor: Vendor): Mono<Vendor> {
        return vendorService.createVendor(vendor)
    }

    @PutMapping("/{id}")
    fun updateVendor(@PathVariable id: Long, @RequestBody vendor: Vendor): Mono<Vendor> {
        return vendorService.updateVendor(id, vendor)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteVendor(@PathVariable id: Long): Mono<Void> {
        return vendorService.deleteVendor(id)
    }
}
