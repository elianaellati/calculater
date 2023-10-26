package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Main extends Application {
	CursorStack<String> m = new CursorStack();
	TextField result = new TextField();

	@Override

	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();

			GridPane g = new GridPane();
			TextField input = new TextField();
			HBox v = new HBox();
			BorderStroke borderStroke = new BorderStroke(Color.BLACK, BorderStrokeStyle.DOTTED, null, null);
			Border border = new Border(borderStroke);
			v.setPadding(new Insets(10, 10, 0, 0));
			input.setFont(Font.font(15));
			input.setFont(Font.font(null, FontWeight.BOLD, input.getFont().getSize()));
			input.setBorder(border);
			input.setMinHeight(45);
			input.setMinWidth(380);
			g.add(input, 0, 0);
			TextField postfix = new TextField();
			postfix.setFont(Font.font(15));
			postfix.setFont(Font.font(null, FontWeight.BOLD, postfix.getFont().getSize()));
			postfix.setBorder(border);
			postfix.setMinHeight(30);
			postfix.setMinWidth(380);
			postfix.setBorder(border);
			g.add(postfix, 0, 1);

			result.setFont(Font.font(15));
			result.setFont(Font.font(null, FontWeight.BOLD, result.getFont().getSize()));
			result.setBorder(border);
			result.setMinHeight(30);
			result.setMinWidth(380);
			result.setBorder(border);
			g.add(result, 0, 2);
			Button sin = new Button("Sin");
			sin.setFont(Font.font(12));
			sin.setStyle("-fx-background-color: SKYBLUE");
			sin.setFont(Font.font(null, FontWeight.BOLD, sin.getFont().getSize()));
			sin.setMinWidth(45);
			sin.setMinHeight(40);
			sin.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("sin" + " ");
				}
			});

			Button cos = new Button("Cos");
			cos.setFont(Font.font(12));
			cos.setStyle("-fx-background-color: SKYBLUE");
			cos.setFont(Font.font(null, FontWeight.BOLD, cos.getFont().getSize()));
			cos.setMinWidth(45);
			cos.setMinHeight(40);
			cos.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("cos" + " ");
					// Math.cos(L)
				}
			});
			Button tan = new Button("Tan");
			tan.setStyle("-fx-background-color: SKYBLUE");
			tan.setFont(Font.font(12));
			tan.setFont(Font.font(null, FontWeight.BOLD, tan.getFont().getSize()));
			tan.setMinWidth(45);
			tan.setMinHeight(40);
			tan.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("tan" + " ");
				}
			});
			Button p = new Button("(");
			p.setFont(Font.font(10));
			p.setFont(Font.font(null, FontWeight.BOLD, p.getFont().getSize()));
			p.setMinWidth(45);
			p.setMinHeight(40);
			p.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText(" " + "(" + " ");
				}
			});
			Button pr = new Button(")");
			pr.setFont(Font.font(12));
			pr.setFont(Font.font(null, FontWeight.BOLD, pr.getFont().getSize()));
			pr.setMinWidth(45);
			pr.setMinHeight(40);
			pr.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText(" " + ")");
				}
			});
			Button b = new Button("!");
			b.setStyle("-fx-background-color: SKYBLUE");
			b.setFont(Font.font(12));
			b.setFont(Font.font(null, FontWeight.BOLD, b.getFont().getSize()));
			b.setMinWidth(45);
			b.setMinHeight(40);
			b.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText(" " + "!");
				}
			});
			Button off = new Button("OFF");
			off.setStyle("-fx-background-color: SKYBLUE");
			off.setFont(Font.font(12));
			off.setFont(Font.font(null, FontWeight.BOLD, off.getFont().getSize()));
			off.setMinWidth(45);
			off.setMinHeight(40);
			off.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					System.exit(0);
				}
			});
			v.getChildren().addAll(sin, cos, tan, p, pr, b, off);
			v.setSpacing(10);
			v.setMaxHeight(45);
			v.setMaxWidth(40);
			g.add(v, 0, 8);
			Button bi = new Button("π");
			bi.setFont(Font.font(12));

			bi.setStyle("-fx-background-color: SKYBLUE");
			bi.setFont(Font.font(null, FontWeight.BOLD, bi.getFont().getSize()));
			bi.setMinWidth(45);
			bi.setMinHeight(40);
			bi.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("3.14159265359");
				}
			});
			Button pow = new Button("y^x");
			pow.setFont(Font.font(12));
			pow.setStyle("-fx-background-color: SKYBLUE");
			pow.setFont(Font.font(null, FontWeight.BOLD, pow.getFont().getSize()));
			pow.setMinWidth(45);
			pow.setMinHeight(40);
			pow.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText(" " + "^" + " ");
				}
			});
			Button seven = new Button("7");

			seven.setStyle("-fx-background-color: Gray ");
			seven.setFont(Font.font(12));
			seven.setFont(Font.font(null, FontWeight.BOLD, seven.getFont().getSize()));
			seven.setMinWidth(45);
			seven.setMinHeight(40);
			seven.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("7");
				}
			});
			Button eight = new Button("8");
			eight.setFont(Font.font(10));
			eight.setStyle("-fx-background-color: Gray ");
			eight.setFont(Font.font(null, FontWeight.BOLD, eight.getFont().getSize()));
			eight.setMinWidth(45);
			eight.setMinHeight(40);
			eight.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("8");
				}
			});
			Button nine = new Button("9");
			nine.setFont(Font.font(12));
			nine.setStyle("-fx-background-color: Gray ");
			nine.setFont(Font.font(null, FontWeight.BOLD, nine.getFont().getSize()));
			nine.setMinWidth(45);
			nine.setMinHeight(40);
			nine.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("9");
				}
			});
			Button div = new Button("÷");
			div.setFont(Font.font(12));
			div.setFont(Font.font(null, FontWeight.BOLD, div.getFont().getSize()));
			div.setMinWidth(45);
			div.setMinHeight(40);
			div.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText(" " + "/" + " ");
				}
			});
			Button sub = new Button("(-)");
			sub.setFont(Font.font(12));
			sub.setFont(Font.font(null, FontWeight.BOLD, sub.getFont().getSize()));
			sub.setMinWidth(45);
			sub.setMinHeight(40);
			HBox h = new HBox();
			sub.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("-");

				}
			});
			h.setPadding(new Insets(10, 10, 0, 0));
			h.getChildren().addAll(bi, pow, seven, eight, nine, div, sub);
			h.setSpacing(10);
			g.add(h, 0, 10);
			Button poww = new Button("X²");
			poww.setFont(Font.font(12));
			poww.setStyle("-fx-background-color: SKYBLUE");
			poww.setFont(Font.font(null, FontWeight.BOLD, poww.getFont().getSize()));
			poww.setMinWidth(45);
			poww.setMinHeight(40);
			poww.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText(" " + "^" + " 2");
				}
			});
			Button sq = new Button("√x");
			sq.setFont(Font.font(12));
			sq.setStyle("-fx-background-color: SKYBLUE");
			sq.setFont(Font.font(null, FontWeight.BOLD, sq.getFont().getSize()));
			sq.setMinWidth(45);
			sq.setMinHeight(40);
			sq.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("√" + " ");
				}
			});
			Button four = new Button("4");
			four.setStyle("-fx-background-color: Gray ");
			four.setFont(Font.font(12));
			four.setFont(Font.font(null, FontWeight.BOLD, four.getFont().getSize()));
			four.setMinWidth(45);
			four.setMinHeight(40);
			four.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("4");
				}
			});
			Button five = new Button("5");
			five.setFont(Font.font(10));

			five.setStyle("-fx-background-color: Gray");
			five.setFont(Font.font(null, FontWeight.BOLD, five.getFont().getSize()));
			five.setMinWidth(45);
			five.setMinHeight(40);
			five.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("5");
				}
			});
			Button six = new Button("6");
			six.setFont(Font.font(12));
			six.setStyle("-fx-background-color: Gray");
			six.setFont(Font.font(null, FontWeight.BOLD, six.getFont().getSize()));
			six.setMinWidth(45);
			six.setMinHeight(40);
			six.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("6");
				}
			});
			Button mul = new Button("×");
			mul.setFont(Font.font(12));
			mul.setFont(Font.font(null, FontWeight.BOLD, mul.getFont().getSize()));
			mul.setMinWidth(45);
			mul.setMinHeight(40);
			mul.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText(" " + "×" + " ");
				}
			});
			Button ca = new Button("CA");
			ca.setFont(Font.font(12));
			ca.setStyle("-fx-background-color: Burlywood");
			ca.setFont(Font.font(null, FontWeight.BOLD, ca.getFont().getSize()));
			ca.setMinWidth(45);
			ca.setMinHeight(40);
			ca.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					input.setText(" ");
					postfix.setText(" ");
					result.setText(" ");

				}

			});
			HBox th = new HBox();
			th.getChildren().addAll(poww, sq, four, five, six, mul, ca);
			th.setSpacing(10);
			g.add(th, 0, 11);
			g.setAlignment(Pos.CENTER);
			th.setPadding(new Insets(10, 10, 0, 0));
			Button ex = new Button("ex");
			ex.setFont(Font.font(12));
			ex.setStyle("-fx-background-color: SKYBLUE");
			ex.setFont(Font.font(null, FontWeight.BOLD, ex.getFont().getSize()));
			ex.setMinWidth(45);
			ex.setMinHeight(40);
			ex.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("e" + " ");

				}

			});
			Button ln = new Button("LN");
			ln.setFont(Font.font(12));
			ln.setStyle("-fx-background-color: SKYBLUE");
			ln.setFont(Font.font(null, FontWeight.BOLD, ln.getFont().getSize()));
			ln.setMinWidth(45);
			ln.setMinHeight(40);
			ln.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("ln" + " ");

				}

			});
			Button one = new Button("1");
			one.setStyle("-fx-background-color: Gray ");
			one.setFont(Font.font(12));
			one.setFont(Font.font(null, FontWeight.BOLD, one.getFont().getSize()));
			one.setMinWidth(45);
			one.setMinHeight(40);
			one.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("1");
				}
			});
			Button two = new Button("2");
			two.setFont(Font.font(12));
			two.setStyle("-fx-background-color: Gray");
			two.setFont(Font.font(null, FontWeight.BOLD, two.getFont().getSize()));
			two.setMinWidth(45);
			two.setMinHeight(40);
			two.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("2");
				}
			});
			Button three = new Button("3");
			three.setFont(Font.font(12));
			three.setStyle("-fx-background-color: Gray");
			three.setFont(Font.font(null, FontWeight.BOLD, three.getFont().getSize()));
			three.setMinWidth(45);
			three.setMinHeight(40);
			three.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("3");
				}
			});
			Button subt = new Button("-");
			subt.setFont(Font.font(12));
			subt.setFont(Font.font(null, FontWeight.BOLD, subt.getFont().getSize()));
			subt.setMinWidth(45);
			subt.setMinHeight(40);
			subt.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText(" " + "-" + " ");
				}
			});
			Button c = new Button("C");
			c.setFont(Font.font(12));
			c.setStyle("-fx-background-color: Burlywood");
			c.setFont(Font.font(null, FontWeight.BOLD, c.getFont().getSize()));
			c.setMinWidth(45);
			c.setMinHeight(40);

			c.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					String r=input.getText().replace("  ", " ");
					r=r.trim();
					String d="";
					String [] token=r.split(" ");
                    for(int o=0;o<token.length-1;++o) {
                    	d=d+" "+token[o]+" ";
                    }
                    input.setText(d);
					/*if (input.getText().lastIndexOf("" ") > 0) {
						input.setText(input.getText().substring(0, input.getText().lastIndexOf(" "))+" ");
					} else if (input.getText().lastIndexOf(" ") < 0) {
						input.setText("");
					}*/

				}

			});
			HBox fo = new HBox();
			fo.getChildren().addAll(ex, ln, one, two, three, subt, c);
			fo.setSpacing(10);
			fo.setPadding(new Insets(10, 10, 0, 0));
			g.add(fo, 0, 12);
			Button log = new Button("LOG");
			log.setFont(Font.font(12));
			log.setStyle("-fx-background-color: SKYBLUE");
			log.setFont(Font.font(null, FontWeight.BOLD, log.getFont().getSize()));
			log.setMinWidth(45);
			log.setMinHeight(40);
			log.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("Log" + " ");

				}

			});
			Button divv = new Button("1/x");
			divv.setFont(Font.font(12));
			divv.setStyle("-fx-background-color: SKYBLUE");
			divv.setFont(Font.font(null, FontWeight.BOLD, divv.getFont().getSize()));
			divv.setMinWidth(45);
			divv.setMinHeight(40);
			divv.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("1 / ");
				}
			});
			Button zero = new Button("0");
			zero.setStyle("-fx-background-color: Gray ");
			zero.setFont(Font.font(12));
			zero.setFont(Font.font(null, FontWeight.BOLD, zero.getFont().getSize()));
			zero.setMinWidth(45);
			zero.setMinHeight(40);
			zero.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText("0");
				}
			});
			Button dot = new Button(".");
			dot.setFont(Font.font(12));
			dot.setFont(Font.font(null, FontWeight.BOLD, dot.getFont().getSize()));
			dot.setMinWidth(45);
			dot.setMinHeight(40);
			dot.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText(".");
				}
			});
			Button mod = new Button("%");
			mod.setFont(Font.font(12));
			mod.setStyle("-fx-background-color: Gray");
			mod.setFont(Font.font(null, FontWeight.BOLD, mod.getFont().getSize()));
			mod.setMinWidth(45);
			mod.setMinHeight(40);
			mod.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText(" " + "%" + " ");
				}
			});
			Button sum = new Button("+");
			sum.setFont(Font.font(12));
			sum.setFont(Font.font(null, FontWeight.BOLD, sum.getFont().getSize()));
			sum.setMinWidth(45);
			sum.setMinHeight(40);
			sum.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent arg0) {
					input.appendText(" " + "+" + " ");

				}
			});
			Button re = new Button("⏎");
			re.setFont(Font.font(12));
			re.setStyle("-fx-background-color: Burlywood");
			re.setFont(Font.font(null, FontWeight.BOLD, re.getFont().getSize()));
			re.setMinWidth(45);
			re.setMinHeight(40);
			re.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					if (input.getText().length() != 1) {
						String s = input.getText().replaceAll("  ", " ");
						input.setText(s.substring(0, s.length() - 1));
					} else {
						input.setText(" ");
					}

				}
			});

			HBox fi = new HBox();
			fi.getChildren().addAll(log, divv, zero, dot, mod, sum, re);
			fi.setSpacing(10);
			fi.setPadding(new Insets(10, 10, 0, 0));
			g.add(fi, 0, 13);
			Button equal = new Button("=");
			equal.setStyle("-fx-background-color: SKYBLUE");
			equal.setFont(Font.font(null, FontWeight.BOLD, equal.getFont().getSize()));
			equal.setMinWidth(380);
			equal.setMinHeight(30);

			equal.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					String p = input.getText();
					p = p.replaceAll("  ", " ");

					try {
						pre(p);
						if (m.isEmpty()) {
							postfixx(p);
							postfix.setText(printt());
							if (calculate().compareToIgnoreCase("Nan") == 0
									|| calculate().compareToIgnoreCase("infinity") == 0 || calculate().compareToIgnoreCase("-infinity") == 0 ) {
								result.setText("Math Error");
							} else {
								result.setText(calculate());
							}
							m.clear();
						} else {
							result.setText("Syntax Error");
							m.stack.cursorArray[m.list].next = 0;
							m.clear();
						}
					} catch (Exception e) {
						result.setText("Syntax Error");
						m.clear();
					}

				}

			});
			HBox eq = new HBox();
			eq.getChildren().add(equal);
			g.add(eq, 0, 14);
			g.setAlignment(Pos.CENTER);
			eq.setPadding(new Insets(10, 10, 0, 0));
			root.setCenter(g);
			Scene scene = new Scene(root, 400, 400);

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public static boolean isNumeric(String p) {

		try {
			double d = Double.parseDouble(p);
		} catch (NumberFormatException nfe) {

			return false;
		}

		return true;
	}

	public String check(String h) {
		String p = "";
		String z = "";
		for (int i = 0; i < h.length(); ++i) {
			if (h.charAt(i) == '-') {
				p = p + h.charAt(i);
			} else {
				z = z + String.valueOf(h.charAt(i));
			}
		}

		String o = subtract(p) + z;

		return o;
	}

	public void postfixx(String r) {
		r = r.trim();
		r = r.replace("  ", " ");
		String[] p = r.split(" ");
		String c = "";
		int t = 0;

		for (int i = 0; i < p.length; ++i) {

			p[i] = check(p[i]);
			if (isNumeric(p[i])) {

				m.d.insert(p[i]);

			} else {

				c = c(p[i], m.list);
				String[] oo = c.split(" ");
				if (c.length() > 1) {
					int o = 0;

					while (o < oo.length) {
						m.d.insert(String.valueOf(oo[o]));
						++o;
					}
				} else if (c != "") {
					m.d.insert(c);
				}
			}

		}

		while (m.isEmpty() == false) {
			m.d.insert(m.pop());
		}

	}

	public String c(String b, int p) {
		int y = m.stack.cursorArray[p].next;
		int t = m.stack.cursorArray[y].next;

		String x = "";
		String v = b;

		if (m.isEmpty()) {
			m.push(String.valueOf(b));
			x = "";
		} else if (b.compareToIgnoreCase("(") == 0) {
			m.push(String.valueOf(b));
		}

		else if (b.compareToIgnoreCase("ln") == 0 || b.compareToIgnoreCase("log") == 0
				|| b.compareToIgnoreCase("√") == 0 || b.compareToIgnoreCase("e") == 0
				|| b.compareToIgnoreCase("cos") == 0 || b.compareToIgnoreCase("sin") == 0
				|| b.compareToIgnoreCase("tan") == 0 || b.compareToIgnoreCase("e") == 0
				|| b.compareToIgnoreCase("-log") == 0 || b.compareToIgnoreCase("-ln") == 0
				|| b.compareToIgnoreCase("-tan") == 0 || b.compareToIgnoreCase("-e") == 0
				|| b.compareToIgnoreCase("-cos") == 0 || b.compareToIgnoreCase("-sin") == 0
						|| b.compareToIgnoreCase("!") == 0
				|| b.compareToIgnoreCase("-√") == 0) {
			m.push(b);
		}

		else if (b.compareToIgnoreCase(")") == 0) {
			while (!m.isEmpty() && m.peek().compareTo("(") != 0) {

				x = x + " " + m.pop();
			}
			m.pop();

		}

		else {
			while (!m.isEmpty() && presidence(String.valueOf(b)) <= presidence(m.peek())) {
				x = x + " " + m.pop();

			}

			m.push(String.valueOf(b));
		}

		x = x.trim();

		x = x.replaceAll("  ", " ");
		return x;
	}

	public int presidence(String b) {
		if (b.compareTo("+") == 0 || b.compareTo("-") == 0) {
			return 1;
		} else if (b.compareTo("/") == 0 || b.compareTo("×") == 0 || b.compareTo("%") == 0) {
			return 2;
		} else if (b.compareTo("^") == 0 || b.compareTo("!") == 0 || b.compareToIgnoreCase("√") == 0
				|| b.compareTo("e") == 0 || b.compareTo("-e") == 0 || b.compareTo("ln") == 0
				|| b.compareToIgnoreCase("log") == 0 || b.compareToIgnoreCase("-log") == 0
				|| b.compareToIgnoreCase("-√") == 0 || b.compareToIgnoreCase("-ln") == 0) {
			return 3;
		} else if (b.compareTo("cos") == 0 || b.compareTo("sin") == 0 || b.compareTo("tan") == 0
				|| b.compareTo("-cos") == 0 || b.compareTo("-sin") == 0 || b.compareTo("-tan") == 0) {
			return 4;
		} else {
			return 0;
		}
	}

	public String printt() {
		Nodee curr = m.d.head;
		String h = "";
		while (curr != null) {
			h = h + curr.getData();
			curr = curr.getNext();
		}
		return h;

	}

	public String calculate() {

		String t;
		double r = 0;
		Nodee curr = m.d.head;
		while (curr != null) {

			t = (String) curr.getData();

			if (t.compareToIgnoreCase("+") == 0) {
				Double A = Double.parseDouble(m.pop());
				Double b = Double.parseDouble(m.pop());

				r = b + A;

				m.push(String.valueOf(r));
			} else if (t.compareToIgnoreCase("cos") == 0 || t.compareToIgnoreCase("-cos") == 0) {
				if (t.compareToIgnoreCase("-cos") == 0) {
					double f = Double.parseDouble(m.pop());
					double d = Math.toRadians(f);
					m.push(String.valueOf(-Math.cos(d)));
				} else {
					double f = Double.parseDouble(m.pop());
					double d = Math.toRadians(f);
					m.push(String.valueOf(Math.cos(d)));
				}

			} else if (t.compareToIgnoreCase("-") == 0) {
				Double A = Double.parseDouble(m.pop());

				if (m.stack.cursorArray[m.list].next != 0) {

					Double b = Double.parseDouble(m.pop());

					r = b - A;
				} else {
					r = -A;
				}

				m.push(String.valueOf(r));
			} else if (t.compareToIgnoreCase("/") == 0) {
				Double A = Double.parseDouble(m.pop());
				Double b = Double.parseDouble(m.pop());

				r = b / A;

				m.push(String.valueOf(r));
			} else if (t.compareToIgnoreCase("%") == 0) {
				Double A = Double.parseDouble(m.pop());
				Double b = Double.parseDouble(m.pop());

				r = b % A;

				m.push(String.valueOf(r));
			} else if (t.compareToIgnoreCase("×") == 0) {
				Double A = Double.parseDouble(m.pop());
				Double b = Double.parseDouble(m.pop());

				r = b * A;

				m.push(String.valueOf(r));
			}

			else if (t.compareToIgnoreCase("tan") == 0 || t.compareToIgnoreCase("-tan") == 0) {
				if (t.compareToIgnoreCase("-tan") == 0) {
					double f = Double.parseDouble(m.pop());
					double d = Math.toRadians(f);
					m.push(String.valueOf(-Math.tan(d)));
				} else {
					double f = Double.parseDouble(m.pop());
					double d = Math.toRadians(f);
					m.push(String.valueOf(Math.tan(d)));
				}
			} else if (t.compareToIgnoreCase("sin") == 0 || t.compareToIgnoreCase("-sin") == 0) {
				if (t.compareToIgnoreCase("-sin") == 0) {
					double f = Double.parseDouble(m.pop());
					double d = Math.toRadians(f);
					m.push(String.valueOf(-Math.sin(d)));
				}
				double f = Double.parseDouble(m.pop());
				double d = Math.toRadians(f);
				m.push(String.valueOf(Math.sin(d)));
			} else if (t.compareToIgnoreCase("^") == 0) {
				Double A = Double.parseDouble(m.pop());
				Double b = Double.parseDouble(m.pop());

				r = Math.pow(b, A);

				m.push(String.valueOf(r));
			}

			else if (t.compareToIgnoreCase("√") == 0 || t.compareToIgnoreCase("-√") == 0) {

				if (t.compareToIgnoreCase("-√") == 0) {
					double f = Double.parseDouble(m.pop());
					m.push(String.valueOf(-Math.sqrt(f)));
				} else {
					double f = Double.parseDouble(m.pop());
					m.push(String.valueOf(Math.sqrt(f)));
				}
			} else if (t.compareToIgnoreCase("!") == 0) {
				double f = factorial(m.pop());
				if (f != 0) {

					m.push(String.valueOf(f));
				} else {

				result.setText("0");
					//curr = null;
				}
			} else if (t.compareToIgnoreCase("log") == 0 || t.compareToIgnoreCase("-log") == 0) {
				if (t.compareToIgnoreCase("-log") == 0) {
					double f = Double.parseDouble(m.pop());
					m.push(String.valueOf(-Math.log10(f)));
				} else {
					double f = Double.parseDouble(m.pop());
					m.push(String.valueOf(Math.log10(f)));
				}
			} else if (t.compareToIgnoreCase("e") == 0 || t.compareToIgnoreCase("-e") == 0) {
				if (t.compareToIgnoreCase("-e") == 0) {
					double f = Double.parseDouble(m.pop());
					m.push(String.valueOf(-Math.exp(f)));
				} else {
					double f = Double.parseDouble(m.pop());
					m.push(String.valueOf(Math.exp(f)));
				}
			} else if (t.compareToIgnoreCase("ln") == 0 || t.compareToIgnoreCase("-ln") == 0) {
				if (t.compareToIgnoreCase("-ln") == 0) {
					double f = Double.parseDouble(m.pop());
					m.push(String.valueOf(-Math.log(f)));
				} else {
					double f = Double.parseDouble(m.pop());
					m.push(String.valueOf(Math.log(f)));
				}
			} else {
				m.push(t);

			}

			curr = curr.getNext();
		}

		return m.pop();
	}

	public double factorial(String y) {
		double c = 1;
		String d = "";
		Double p = 0.0;
		if (y.charAt(0) == '-') {
			d = String.valueOf(y.charAt(0));
			String h = y.substring(1, y.length());
			y = h;
		}

		Double t = Double.parseDouble(y);

		if (t % 1 == 0) {
			while (t > 0) {
				c = c * t;
				--t;
			}
			
			String m = d + String.valueOf(c);
			p = Double.parseDouble(m);
			return p;
		} else {
			p = 0.0;
		}

		return p;
	}

	public String subtract(String s) {
		String h = "";
		Double f;
		int y = 0;
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == '-') {
				y = y + 1;
			}

			else {
				h = h + s.charAt(i);
			}
		}
		if (y % 2 == 0) {
			h = h;
		} else {
			h = "-" + h;
		}
		return h;
	}

	public void pre(String p) {
		p.trim();
		String[] token = p.split(" ");
		for (int i = 0; i < token.length; ++i) {
			if (token[i].compareToIgnoreCase("(") == 0 || token[i].compareToIgnoreCase(")") == 0) {
				c(token[i], m.list);
			}
		}

	}

}
