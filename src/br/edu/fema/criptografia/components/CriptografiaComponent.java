package br.edu.fema.criptografia.components;

import java.lang.reflect.Field;

import br.edu.fema.criptografia.annotations.Criptografia;

public abstract class CriptografiaComponent {

	public static void isValid(Object object) throws Exception {
		String palavra = null;
		Class<?> klass = object.getClass();

		Field[] fields = klass.getDeclaredFields();
		if (fields != null && fields.length > 0) {
			for (Field field : fields) {
				field.setAccessible(true);

				Object value = field.get(object);

				if (field.isAnnotationPresent(Criptografia.class)) {

					if (value != null) {
						Criptografia crip = field.getDeclaredAnnotation(Criptografia.class);

						if (crip.isEnable()) {

							char[] letras = null;
							palavra = value.toString().toUpperCase();
							letras = palavra.toCharArray();

							for (int i = 0; i < letras.length; i++) {

								switch (letras[i]) {

								case 'A':

									letras[i] = '?';
									break;

								case 'B':
									letras[i] = '!';
									break;

								case 'C':
									letras[i] = '<';
									break;

								case 'D':
									letras[i] = '>';
									break;

								case 'E':
									letras[i] = '|';
									break;

								case 'F':
									letras[i] = '{';
									break;

								case 'G':
									letras[i] = '}';
									break;

								case 'H':
									letras[i] = '[';
									break;

								case 'I':
									letras[i] = ']';
									break;

								case 'J':
									letras[i] = '^';
									break;

								case 'K':
									letras[i] = 'Â';
									break;

								case 'L':
									letras[i] = '~';
									break;

								case 'M':
									letras[i] = '*';
									break;

								case 'N':
									letras[i] = '&';
									break;

								case 'O':
									letras[i] = '+';
									break;

								case 'P':
									letras[i] = '=';
									break;

								case 'Q':
									letras[i] = '@';
									break;

								case 'R':
									letras[i] = '#';
									break;

								case 'S':
									letras[i] = '%';
									break;

								case 'T':
									letras[i] = '!';
									break;

								case 'U':
									letras[i] = '4';
									break;

								case 'V':
									letras[i] = '3';
									break;

								case 'W':
									letras[i] = '$';
									break;

								case 'Y':
									letras[i] = 'Â';
									break;

								case 'Z':
									letras[i] = '7';
									break;

								case '0':
									letras[i] = 'p';
									break;

								case '1':
									letras[i] = '8';
									break;

								case '2':
									letras[i] = '/';
									break;

								case '3':
									letras[i] = '^';
									break;
									
								case '4':
									letras[i] = ';';
									break;

								case '5':
									letras[i] = '&';
									break;

								case '6':
									letras[i] = '@';
									break;

								case '7':
									letras[i] = '>';
									break;

								case '8':
									letras[i] = '<';
									break;

								case '9':
									letras[i] = '_';
									break;

								}
								/*
								 * palavra = String.copyValueOf(letras); System.out.println(palavra);
								 */ // passo a passo

							}

							palavra = String.copyValueOf(letras);
							System.out.println(palavra);

						}
					}

				}
			}
		}

	}
}
