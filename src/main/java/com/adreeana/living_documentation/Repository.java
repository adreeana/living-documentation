/**
 *
 */
package com.adreeana.living_documentation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Mediates between the domain and data mapping layers using a collection-like
 * interface for accessing domain objects.
 */
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Repository {

	@SuppressWarnings("rawtypes")
	Class[] value() default {};

	String[] link() default {
		"http://martinfowler.com/eaaCatalog/repository.html"
	};
}