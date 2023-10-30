package org.zerock.myapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.myapp.domain.*;
import org.zerock.myapp.mapper.MovieMapper;

import java.util.Arrays;
import java.util.List;

@Log4j2
@RequiredArgsConstructor

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieMapper movieMapper;

    @Override
    public List<MovieVO> findAllMovies() {
        log.trace("findAllMovies({}) invoked.");

        return movieMapper.findAllMovies();
    } // findAllMovies

    @Override
    public List<MovieVO> searchMovies(String searchInput, String searchCategory) {
        log.trace("searchMovies({}, {}) invoked.", searchInput, searchCategory);
        return movieMapper.searchMovies(searchInput, searchCategory);
    } // searchMovies

    @Override
    public List<MovieVO> searchByGenre(List<String> searchGenre) {
        log.trace("searchByGenre({}) invoked.", searchGenre);
        return movieMapper.searchByGenre(searchGenre);
    } // searchByGenre

    @Override
    public List<MovieVO> searchByDate(String startDate, String endDate) {
        log.trace("searchByDate({}, {}) invoked.", startDate, endDate);
        return movieMapper.searchByDate(startDate, endDate);
    } // searchByDate

    @Override
    public MovieVO findDetailMovie(Long memberId) {
        log.trace("findDetailMovie({}) invoked.", memberId);
        return movieMapper.findDetailMovie(memberId);
    } // findDetailMovie

    @Override
    public List<MovieGenreVO> genreOfMovies(Long memberId) {
        log.trace("genreOfMovies({}) invoked.", memberId);
        return movieMapper.genreOfMovies(memberId);
    } // genreOfMovies

    @Override
    public List<CreditsVO> castsOfMovies(Long memberId) {
        log.trace("castsOfMovies({}) invoked.", memberId);
        return movieMapper.castsOfMovies(memberId);
    } // castsOfMovies

    @Override
    public List<CreditsVO> crewsOfMovies(Long memberId) {
        log.trace("crewsOfMovies({}) invoked.", memberId);
        return movieMapper.crewsOfMovies(memberId);
    } // crewsOfMovies

    @Override
    public CertificationVO certificationsOfMovies(Long memberId) {
        log.trace("certificationsOfMovies({}) invoked.", memberId);
        return movieMapper.certificationsOfMovies(memberId);
    } // certificationsOfMovies

    @Override
    public List<authorOfBoardVO> findBoardByMovie(Long memberId) {
        log.trace("findBoardByMovie({}) invoked.", memberId);
        return movieMapper.findBoardByMovie(memberId);
    } // findBoardByMovie

} // end class
