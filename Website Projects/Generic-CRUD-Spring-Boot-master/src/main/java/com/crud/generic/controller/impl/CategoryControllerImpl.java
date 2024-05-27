package com.crud.generic.controller.impl;

import com.crud.generic.controller.CategoryController;
import com.crud.generic.controller.generic.impl.ControllerGenericImpl;
import com.crud.generic.entity.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/category")
public class CategoryControllerImpl extends ControllerGenericImpl<Category> implements CategoryController {
}
