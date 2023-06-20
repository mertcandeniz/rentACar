package kodlama.io.rentACar.webAPI.controllers;

import kodlama.io.rentACar.business.abstracts.BrandService;

public class BrandsControllerBuilder {
    private BrandService brandService;

    public BrandsControllerBuilder setBrandService(BrandService brandService) {
        this.brandService = brandService;
        return this;
    }

    public BrandsController createBrandsController() {
        return new BrandsController(brandService);
    }
}