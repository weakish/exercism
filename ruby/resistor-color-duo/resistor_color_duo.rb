module ResistorColorDuo
  def self.value(colors)
    first_color, second_color = colors
    color_number_map = {"Black" => 0,
      "Brown" => 1,
      "Red" => 2,
      "Orange" => 3,
      "Yellow" => 4,
      "Green" => 5,
      "Blue" => 6,
      "Violet" => 7,
      "Grey" => 8,
      "White" => 9,
    }
    "#{color_number_map[first_color]}#{color_number_map[second_color]}"
  end
end