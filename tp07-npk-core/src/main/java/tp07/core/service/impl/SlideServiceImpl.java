package tp07.core.service.impl;

import javax.inject.Inject;

import tp07.core.dao.SlideDAO;
import tp07.core.entity.SlideEntity;
import tp07.core.service.SlideService;

public class SlideServiceImpl implements SlideService {

	@Inject
	private SlideDAO slideDAO;

	@Override
	public void saveSlide(SlideEntity slide) {
		slideDAO.save(slide);
	}

	@Override
	public void findCurrentSlide() {
		// TODO Auto-generated method stub

	}

}
