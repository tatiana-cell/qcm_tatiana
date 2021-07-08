package simplon.com.mcq.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import simplon.com.mcq.domain.entities.Category;
import simplon.com.mcq.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categories;

    public CategoryServiceImpl(CategoryRepository categories) {

	this.categories = categories;
    }

    @Override
    public List<CategotyView> getAll() {
List<Category> categories =	categories.findAll();

List<CategotyView> categoriesView = new ArrayList()<>();


for (CategoryView view:categoriesView) {
    CategotyView categotyView = (CategotyView) iterator.next();
    
}

	return categoriesView;
    }

}
