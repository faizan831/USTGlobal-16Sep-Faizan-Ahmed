import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
  movies: any[];
  constructor(private http: HttpClient) { }

  ngOnInit() {
  }
  showMovies(movie) {
    console.log(movie);
    this.http.get<any>(`http://www.omdbapi.com/?s=${movie}&apikey=8906bb9c`).subscribe(data => {
      this.movies = data.Search;
      console.log(this.movies);
    });
  }
}
