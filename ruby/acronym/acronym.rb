module Acronym
  def self.abbreviate(full_name)
    full_name.split(/\W+/).map { |word| word[0].capitalize }.join
  end
end
