import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { CarsComponent } from './cars/cars.component';
import { NewsComponent } from './news/news.component';
import { MobileComponent } from './mobile/mobile.component';
import { RecipesComponent } from './recipes/recipes.component';
import { RecipeDetailsComponent } from './recipe-details/recipe-details.component';
import { NewsDetailsComponent } from './news-details/news-details.component';
import { MobileDetailsComponent } from './mobile-details/mobile-details.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { CarDetailsComponent } from './car-details/car-details.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CarsComponent,
    NewsComponent,
    MobileComponent,
    RecipesComponent,
    RecipeDetailsComponent,
    NewsDetailsComponent,
    MobileDetailsComponent,
    PageNotFoundComponent,
    CarDetailsComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot([
      {path : 'cars', component : CarsComponent },
      { path : 'news', component : NewsComponent},
      { path : 'mobile' , component : MobileComponent},
      {path : 'mobile-details' , component : MobileDetailsComponent},
      { path : 'news-details' , component : NewsDetailsComponent},
      {path : 'page-not-found', component : PageNotFoundComponent},
      { path : 'recipe-details' , component : RecipeDetailsComponent},
      { path : 'recipes' , component : RecipesComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
