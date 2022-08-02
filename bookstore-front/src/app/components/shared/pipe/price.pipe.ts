import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'brl',
})
export class PricePipe implements PipeTransform {
  text: string = '';

  transform(value: string) {
    return (this.text = value
      .replace(/(\D)/g, '')
      .replace(/(\d{1,3})(\d{2})/g, 'R$ $1,$2'));
  }
}
