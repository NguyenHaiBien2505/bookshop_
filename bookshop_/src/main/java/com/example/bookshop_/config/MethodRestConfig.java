package com.example.bookshop_.config;

import com.example.bookshop_.entity.NguoiDung;
import com.example.bookshop_.entity.TheLoai;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MethodRestConfig implements RepositoryRestConfigurer {
    private String url = "http://localhost:8080";
    @Autowired
    private EntityManager entityManager;
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {


        // expose ids
        // Cho phép trả về id
        Class<?>[] entityClasses = entityManager.getMetamodel()
                .getEntities()
                .stream()
                .map(entityType -> entityType.getJavaType())
                .toArray(Class[]::new);

        config.exposeIdsFor(entityClasses);
        // config.exposeIdsFor(TheLoai.class);

        // Chặn các methods
        HttpMethod[] chanCacPhuongThuc ={
                HttpMethod.POST,
                HttpMethod.PUT,
                HttpMethod.PATCH,
                HttpMethod.DELETE,
        };
        disableHttpMethods(TheLoai.class, config, chanCacPhuongThuc);

        // Chặn các method DELETE
        HttpMethod[] phuongThucDelete = {
                HttpMethod.DELETE
        };
        disableHttpMethods(NguoiDung.class, config,phuongThucDelete );
    }

    private void disableHttpMethods(Class c,
                                    RepositoryRestConfiguration config,
                                    HttpMethod[] methods){
        config.getExposureConfiguration()
                .forDomainType(c)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(methods))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(methods));
    }
}
